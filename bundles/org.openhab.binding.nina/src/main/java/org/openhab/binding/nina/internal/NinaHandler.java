/**
 * Copyright (c) 2010-2024 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.nina.internal;

import static org.openhab.binding.nina.internal.NinaBindingConstants.*;

import java.time.ZoneId;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.http.HttpStatus;
import org.openhab.binding.nina.internal.model.ARSOverviewResultInner;
import org.openhab.binding.nina.internal.model.Warning;
import org.openhab.binding.nina.internal.model.WarningInfoInner;
import org.openhab.core.library.types.DateTimeType;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.library.types.StringType;
import org.openhab.core.thing.*;
import org.openhab.core.thing.binding.BaseThingHandler;
import org.openhab.core.thing.binding.ThingHandlerCallback;
import org.openhab.core.thing.binding.builder.ThingBuilder;
import org.openhab.core.thing.type.ChannelTypeUID;
import org.openhab.core.types.Command;
import org.openhab.core.types.RefreshType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

/**
 * The {@link NinaHandler} is responsible for handling commands, which are
 * sent to one of the channels.
 *
 * @author Andre Krautschick - Initial contribution
 */
@NonNullByDefault
public class NinaHandler extends BaseThingHandler {

    private final Logger logger = LoggerFactory.getLogger(NinaHandler.class);
    private final HttpClient httpClient;
    private final Gson gson;
    private @Nullable NinaConfiguration config;

    private @Nullable ScheduledFuture<?> refreshJob;

    public NinaHandler(Thing thing, HttpClient httpClient) {
        super(thing);
        this.httpClient = httpClient;
        this.gson = new Gson();
    }

    @Override
    public void handleCommand(ChannelUID channelUID, Command command) {
        logger.debug("From {} Received command {}", channelUID.getAsString(), command.toFullString());
        if (command instanceof RefreshType) {
            // TODO: handle data refresh
            pollingArsOverviewResult();
            if (WARNING_CHANNEL.equals(channelUID.getId())) {
            }
        }
    }

    @Override
    public void initialize() {
        updateStatus(ThingStatus.UNKNOWN);
        config = getConfigAs(NinaConfiguration.class);
        if (!config.isValid()) {
            updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.CONFIGURATION_ERROR,
                    "Need to set serverURL to a valid URL. Refresh interval needs to be a positive integer.");
            return;
        }
        // TODO: Initialize the handler.
        // The framework requires you to return from this method quickly, i.e. any network access must be done in
        // the background initialization below.
        // Also, before leaving this method a thing status from one of ONLINE, OFFLINE or UNKNOWN must be set. This
        // might already be the real thing status in case you can decide it directly.
        // In case you can not decide the thing status directly (e.g. for long running connection handshake using WAN
        // access or similar) you should set status UNKNOWN here and then decide the real status asynchronously in the
        // background.

        // set the thing status to UNKNOWN temporarily and let the background task decide for the real status.
        // the framework is then able to reuse the resources from the thing handler initialization.
        // we set this upfront to reliably check status updates in unit tests.

        // createChannelSet(5);
        refreshJob = scheduler.scheduleWithFixedDelay(this::pollingArsOverviewResult, 0, config.getRefreshInterval(),
                TimeUnit.SECONDS);

        // These logging types should be primarily used by bindings
        // logger.trace("Example trace message");
        // logger.debug("Example debug message");
        // logger.warn("Example warn message");
        //
        // Logging to INFO should be avoided normally.
        // See https://www.openhab.org/docs/developer/guidelines.html#f-logging

        // Note: When initialization can NOT be done set the status with more details for further
        // analysis. See also class ThingStatusDetail for all available status details.
        // Add a description to give user information to understand why thing does not work as expected. E.g.
        // updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.CONFIGURATION_ERROR,
        // "Can not access device as username and/or password are invalid");
    }

    @Override
    public void dispose() {
        if (this.refreshJob != null) {
            this.refreshJob.cancel(true);
            this.refreshJob = null;
        }
    }

    private void pollingArsOverviewResult() {
        ARSOverviewResultInner[] arsOverviewResult = sendRequest(
                config.getServerUrl() + "/dashboard/" + config.getArs() + ".json", ARSOverviewResultInner[].class);

        if (arsOverviewResult == null) {
            return;
        } else if (arsOverviewResult.length <= 0) {
            return;
        }
        updateStatus(ThingStatus.ONLINE);

        logger.debug("Number of results: {}", arsOverviewResult.length);
        for (int index = 0; index < arsOverviewResult.length && index < config.getNumberWarningSets(); index++) {
            logger.debug("Parse entry no. {}", index);
            createChannelSet(index);
            ARSOverviewResultInner resultInner = arsOverviewResult[index];
            // logger.debug("{}", resultInner.toString());

            pollingWarningDetails(arsOverviewResult[index].getId(), index);

            updateState(HEADLINE_CHANNEL + index,
                    new StringType(arsOverviewResult[index].getPayload().getData().getHeadline()));
            updateState(VERSION_CHANNEL + index, new DecimalType(arsOverviewResult[index].getPayload().getVersion()));
            updateState(TYPE_CHANNEL + index,
                    new StringType(arsOverviewResult[index].getPayload().getData().getHeadline()));
            updateState(PROVIDER_CHANNEL + index,
                    new StringType(arsOverviewResult[index].getPayload().getData().getProvider()));
            updateState(SEVERITY_CHANNEL + index,
                    new StringType(arsOverviewResult[index].getPayload().getData().getSeverity()));
            updateState(MSG_TYPE_CHANNEL + index,
                    new StringType(arsOverviewResult[index].getPayload().getData().getMsgType()));
            updateState(SENT_CHANNEL + index,
                    new DateTimeType(arsOverviewResult[index].getSent().toInstant().atZone(ZoneId.systemDefault())));
        }
    }

    private void pollingWarningDetails(String id, int index) {
        Warning warning = sendRequest(config.getServerUrl() + "/warnings/" + id + ".json", Warning.class);
        if (warning == null) {
            return;
        }
        WarningInfoInner warningInfo = warning.getInfo().get(0);
        updateState(DESCRIPTION_CHANNEL + index, new StringType(warningInfo.getDescription()));
        updateState(URGENCY_CHANNEL + index, new StringType(warningInfo.getUrgency()));
        updateState(CATEGORY_CHANNEL + index, new StringType(warningInfo.getCategory().toString()));
        updateState(EVENT_CHANNEL + index, new StringType(warningInfo.getEvent()));
        updateState(SENDER_CHANNEL + index, new StringType(warning.getSender()));
        updateState(STATUS_CHANNEL + index, new StringType(warning.getStatus()));
        updateState(SCOPE_CHANNEL + index, new StringType(warning.getScope()));
        updateState(CERTAINTY_CHANNEL + index, new StringType());
        updateState(IDENTIFIER_CHANNEL + index, new StringType(warning.getIdentifier()));

        // logger.debug("{}", warning.toString());
    }

    private <T> T sendRequest(String url, Class<T> t) {
        T result = null;
        try {
            ContentResponse response = this.httpClient.newRequest(url).timeout(5000, TimeUnit.MILLISECONDS).send();
            if (response.getStatus() == HttpStatus.OK_200) {
                logger.debug("Received response: {}", response.getContentAsString());
                result = this.gson.fromJson(response.getContentAsString(), t);
            } else {
                updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.COMMUNICATION_ERROR,
                        "No valid response from Nina API.");
                logger.debug("Received status {} and response: {}", response.getStatus(), response.getContentAsString());
            }
        } catch (InterruptedException | TimeoutException | ExecutionException e) {
            updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.COMMUNICATION_ERROR,
                    "Nina request failed: " + e.getMessage());
        } catch (Exception e) {
            logger.error("Unexpected error occurred: {}", e.getMessage());
        }
        return result;
    }

    private void createChannelSet(int number) {
        ThingHandlerCallback callback = getCallback();
        if (callback != null) {
            ThingBuilder builder = editThing();
            createChannel(callback, builder, HEADLINE_CHANNEL, "Headline", number);
            createChannel(callback, builder, VERSION_CHANNEL, "Version", number);
            createChannel(callback, builder, TYPE_CHANNEL, "Type", number);
            createChannel(callback, builder, PROVIDER_CHANNEL, "Provider", number);
            createChannel(callback, builder, SEVERITY_CHANNEL, "Severity", number);
            createChannel(callback, builder, MSG_TYPE_CHANNEL, "MsgType", number);
            createChannel(callback, builder, SENT_CHANNEL, "Sent", number);
            createChannel(callback, builder, DESCRIPTION_CHANNEL, "Description", number);
            createChannel(callback, builder, URGENCY_CHANNEL, "Urgency", number);
            createChannel(callback, builder, CATEGORY_CHANNEL, "Category", number);
            createChannel(callback, builder, EVENT_CHANNEL, "Event", number);
            createChannel(callback, builder, SENDER_CHANNEL, "Sender", number);
            createChannel(callback, builder, STATUS_CHANNEL, "Status", number);
            createChannel(callback, builder, SCOPE_CHANNEL, "Scope", number);
            createChannel(callback, builder, CERTAINTY_CHANNEL, "Certainty", number);
            createChannel(callback, builder, IDENTIFIER_CHANNEL, "ID", number);
            updateThing(builder.build());
        }
    }

    private void createChannel(ThingHandlerCallback cb, ThingBuilder builder, String channelId, String label,
            int number) {
        ChannelUID channelUID = getChannelUid(channelId, number);
        Channel existingChannel = getThing().getChannel(channelUID);
        if (existingChannel == null) {
            builder.withChannel(cb.createChannelBuilder(channelUID, getChannelTypeUid(channelId))
                    .withLabel(label + "_" + number).build());
        }
        // else {
        // builder.withoutChannel(channelUID);
        // }
    }

    private ChannelUID getChannelUid(String channelId, int number) {
        return new ChannelUID(getThing().getUID(), channelId + number);
    }

    private ChannelTypeUID getChannelTypeUid(String channelId) {
        return new ChannelTypeUID(BINDING_ID, channelId);
    }
}
