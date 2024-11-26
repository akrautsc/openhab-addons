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

        createChannelSet(5);
        refreshJob = scheduler.scheduleWithFixedDelay(this::pollingArsOverviewResult, 0, config.refreshInterval,
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
                config.serverUrl + "/dashboard/" + config.ars + ".json", ARSOverviewResultInner[].class);

        if (arsOverviewResult == null) {
            return;
        } else if (arsOverviewResult.length <= 0) {
            updateStatus(ThingStatus.ONLINE);
            return;
        }

        for (ARSOverviewResultInner inner : arsOverviewResult) {
            String innerString = inner.toString();
            logger.debug(innerString);
            // pollingWarningDetails(inner.getId());
        }
        pollingWarningDetails(arsOverviewResult[0].getId());

        updateState(HEADLINE_CHANNEL, new StringType(arsOverviewResult[0].getPayload().getData().getHeadline()));
        updateState(VERSION_CHANNEL, new DecimalType(arsOverviewResult[0].getPayload().getVersion()));
        updateState(TYPE_CHANNEL, new StringType(arsOverviewResult[0].getPayload().getData().getHeadline()));
        updateState(PROVIDER_CHANNEL, new StringType(arsOverviewResult[0].getPayload().getData().getProvider()));
        updateState(SEVERITY_CHANNEL, new StringType(arsOverviewResult[0].getPayload().getData().getSeverity()));
        updateState(MSG_TYPE_CHANNEL, new StringType(arsOverviewResult[0].getPayload().getData().getMsgType()));
        updateState(SENT_CHANNEL,
                new DateTimeType(arsOverviewResult[0].getSent().toInstant().atZone(ZoneId.systemDefault())));
    }

    private void pollingWarningDetails(String id) {
        Warning warning = sendRequest(config.serverUrl + "/warnings/" + id + ".json", Warning.class);
        if (warning == null) {
            return;
        }
        WarningInfoInner warningInfo = warning.getInfo().get(0);
        updateState(DESCRIPTION_CHANNEL, new StringType(warningInfo.getDescription()));
        updateState(URGENCY_CHANNEL, new StringType(warningInfo.getUrgency()));
        updateState(CATEGORY_CHANNEL, new StringType(warningInfo.getCategory().toString()));
        updateState(EVENT_CHANNEL, new StringType(warningInfo.getEvent()));
        updateState(SENDER_CHANNEL, new StringType(warning.getSender()));
        updateState(STATUS_CHANNEL, new StringType(warning.getStatus()));
        updateState(SCOPE_CHANNEL, new StringType(warning.getScope()));
        updateState(CERTAINTY_CHANNEL, new StringType());
        updateState(IDENTIFIER_CHANNEL, new StringType(warning.getIdentifier()));

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
                logger.debug("Received response: {}", response.getContentAsString());
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
            builder.withChannel(createChannel(callback, HEADLINE_CHANNEL, "Headline", number));
            builder.withChannel(createChannel(callback, VERSION_CHANNEL, "Version", number));
            builder.withChannel(createChannel(callback, TYPE_CHANNEL, "Type", number));
            builder.withChannel(createChannel(callback, PROVIDER_CHANNEL, "Provider", number));
            builder.withChannel(createChannel(callback, SEVERITY_CHANNEL, "Severity", number));
            builder.withChannel(createChannel(callback, MSG_TYPE_CHANNEL, "MsgType", number));
            builder.withChannel(createChannel(callback, SENT_CHANNEL, "Sent", number));
            builder.withChannel(createChannel(callback, DESCRIPTION_CHANNEL, "Description", number));
            builder.withChannel(createChannel(callback, URGENCY_CHANNEL, "Urgency", number));
            builder.withChannel(createChannel(callback, CATEGORY_CHANNEL, "Category", number));
            builder.withChannel(createChannel(callback, EVENT_CHANNEL, "Event", number));
            builder.withChannel(createChannel(callback, SENDER_CHANNEL, "Sender", number));
            builder.withChannel(createChannel(callback, STATUS_CHANNEL, "Status", number));
            builder.withChannel(createChannel(callback, SCOPE_CHANNEL, "Scope", number));
            builder.withChannel(createChannel(callback, CERTAINTY_CHANNEL, "Certainty", number));
            builder.withChannel(createChannel(callback, IDENTIFIER_CHANNEL, "ID", number));
            updateThing(builder.build());
        }
    }

    private Channel createChannel(ThingHandlerCallback cb, String channelId, String label, int number) {
        ChannelUID channelUID = getChannelUid(channelId, number);
        Channel existingChannel = getThing().getChannel(channelUID);
        if (existingChannel != null) {
            editThing().withoutChannel(channelUID);
        }
        return cb.createChannelBuilder(channelUID, getChannelTypeUid(channelId)).withLabel(label + "_" + number)
                .build();
    }

    private ChannelUID getChannelUid(String channelId, int number) {
        return new ChannelUID(getThing().getUID(), channelId + number);
    }

    private ChannelTypeUID getChannelTypeUid(String channelId) {
        return new ChannelTypeUID(BINDING_ID, channelId);
    }
}
