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

    private int currentChannelSets = 0;

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
        currentChannelSets = getThing().getChannels().size() / channelMap.size();
        logger.trace("Channel sets existing during initialization: {}", currentChannelSets);

        currentChannelSets = config.getMinNumberWarningSets();

        refreshJob = scheduler.scheduleWithFixedDelay(this::pollingArsOverviewResult, 0, config.getRefreshInterval(),
                TimeUnit.SECONDS);
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
        }
        updateStatus(ThingStatus.ONLINE);

        int expectedChannelSets = arsOverviewResult.length;
        logger.trace("Current channel sets: {}. expected channel sets: {}", currentChannelSets, expectedChannelSets);
        if (expectedChannelSets != currentChannelSets) {
            createAndRemoveChannelSets(expectedChannelSets);
            currentChannelSets = expectedChannelSets;
        }
        for (int index = 0; index < expectedChannelSets; index++) {
            logger.debug("Parse entry no. {}", index + 1);
            ARSOverviewResultInner arsOverviewResultInner = arsOverviewResult[index];
            Warning warning = sendRequest(
                    config.getServerUrl() + "/warnings/" + arsOverviewResultInner.getId() + ".json", Warning.class);
            updateChannelSet(arsOverviewResultInner, warning, index + 1);
        }
    }

    private void updateChannelSet(ARSOverviewResultInner arsOverviewResultInner, Warning warning, int index) {
        logger.debug("Update channel set {}", index);
        updateState(HEADLINE_CHANNEL + index,
                new StringType(arsOverviewResultInner.getPayload().getData().getHeadline()));
        updateState(VERSION_CHANNEL + index, new DecimalType(arsOverviewResultInner.getPayload().getVersion()));
        updateState(TYPE_CHANNEL + index, new StringType(arsOverviewResultInner.getPayload().getData().getHeadline()));
        updateState(PROVIDER_CHANNEL + index,
                new StringType(arsOverviewResultInner.getPayload().getData().getProvider()));
        updateState(SEVERITY_CHANNEL + index,
                new StringType(arsOverviewResultInner.getPayload().getData().getSeverity()));
        updateState(MSG_TYPE_CHANNEL + index,
                new StringType(arsOverviewResultInner.getPayload().getData().getMsgType().toString()));
        updateState(SENT_CHANNEL + index,
                new DateTimeType(arsOverviewResultInner.getSent().toInstant().atZone(ZoneId.systemDefault())));
        WarningInfoInner warningInfo = warning.getInfo().get(0);
        updateState(DESCRIPTION_CHANNEL + index, new StringType(warningInfo.getDescription()));
        updateState(URGENCY_CHANNEL + index, new StringType(warningInfo.getUrgency()));
        updateState(CATEGORY_CHANNEL + index, new StringType(warningInfo.getCategory().toString()));
        updateState(EVENT_CHANNEL + index, new StringType(warningInfo.getEvent()));
        updateState(SENDER_CHANNEL + index, new StringType(warning.getSender()));
        updateState(STATUS_CHANNEL + index, new StringType(warning.getStatus().toString()));
        updateState(SCOPE_CHANNEL + index, new StringType(warning.getScope().toString()));
        updateState(CERTAINTY_CHANNEL + index, new StringType(warningInfo.getCertainty()));
        updateState(IDENTIFIER_CHANNEL + index, new StringType(warning.getIdentifier()));
    }

    private void clearChannelSet(int index) {
        logger.debug("Clear channel set {}", index);
        updateState(HEADLINE_CHANNEL + index, StringType.EMPTY);
        updateState(VERSION_CHANNEL + index, DecimalType.ZERO);
        updateState(TYPE_CHANNEL + index, StringType.EMPTY);
        updateState(PROVIDER_CHANNEL + index, StringType.EMPTY);
        updateState(SEVERITY_CHANNEL + index, StringType.EMPTY);
        updateState(MSG_TYPE_CHANNEL + index, StringType.EMPTY);
        updateState(SENT_CHANNEL + index, new DateTimeType());
        updateState(DESCRIPTION_CHANNEL + index, StringType.EMPTY);
        updateState(URGENCY_CHANNEL + index, StringType.EMPTY);
        updateState(CATEGORY_CHANNEL + index, StringType.EMPTY);
        updateState(EVENT_CHANNEL + index, StringType.EMPTY);
        updateState(SENDER_CHANNEL + index, StringType.EMPTY);
        updateState(STATUS_CHANNEL + index, StringType.EMPTY);
        updateState(SCOPE_CHANNEL + index, StringType.EMPTY);
        updateState(CERTAINTY_CHANNEL + index, StringType.EMPTY);
        updateState(IDENTIFIER_CHANNEL + index, StringType.EMPTY);
    }

    private <T> T sendRequest(String url, Class<T> t) {
        T result = null;
        try {
            ContentResponse response = this.httpClient.newRequest(url).timeout(5000, TimeUnit.MILLISECONDS).send();
            if (response.getStatus() == HttpStatus.OK_200) {
                logger.trace("Received response: {}", response.getContentAsString());
                result = this.gson.fromJson(response.getContentAsString(), t);
            } else {
                updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.COMMUNICATION_ERROR,
                        "No valid response from Nina API.");
                logger.debug("Received status {} and response: {}", response.getStatus(),
                        response.getContentAsString());
            }
        } catch (InterruptedException | TimeoutException | ExecutionException e) {
            updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.COMMUNICATION_ERROR,
                    "Nina request failed: " + e.getMessage());
        } catch (Exception e) {
            logger.error("Unexpected error occurred: {}", e.getMessage());
        }
        return result;
    }

    private void createAndRemoveChannelSets(int numberChannelSets) {
        int maxChannelSets = config.getMaxNumberWarningSets();
        for (int index = currentChannelSets + 1; index <= numberChannelSets && index <= maxChannelSets; index++) {
            logger.debug("Create set {}", index);
            createChannelSet(index);
        }
        for (int index = currentChannelSets; index > numberChannelSets && index > maxChannelSets; index--) {
            logger.debug("Remove set {}", index);
            clearChannelSet(index);
            removeChannelSet(index);
        }
    }

    private void createChannelSet(int number) {
        ThingHandlerCallback callback = getCallback();
        if (callback != null) {
            ThingBuilder builder = editThing();
            channelMap.forEach((channelId, label) -> createChannel(callback, builder, channelId, label, number));
            updateThing(builder.build());
        }
    }

    private void removeChannelSet(int number) {
        ThingHandlerCallback callback = getCallback();
        if (callback != null) {
            ThingBuilder builder = editThing();
            channelMap.forEach((channelId, label) -> removeChannel(callback, builder, channelId, number));
            updateThing(builder.build());
        }
    }

    private void createChannel(ThingHandlerCallback cb, ThingBuilder builder, String channelId, String label,
            int number) {
        ChannelUID channelUID = getChannelUid(channelId, number);
        Channel existingChannel = getThing().getChannel(channelUID);
        if (existingChannel == null) {
            builder.withChannel(cb.createChannelBuilder(channelUID, getChannelTypeUid(channelId))
                    .withLabel(label + number).build());
        }
    }

    public void removeChannel(ThingHandlerCallback cb, ThingBuilder builder, String channelId, int number) {
        ChannelUID channelUID = getChannelUid(channelId, number);
        Channel existingChannel = getThing().getChannel(channelUID);
        if (existingChannel != null) {
            builder.withoutChannel(channelUID);
        }
    }

    private ChannelUID getChannelUid(String channelId, int number) {
        return new ChannelUID(getThing().getUID(), channelId + number);
    }

    private ChannelTypeUID getChannelTypeUid(String channelId) {
        return new ChannelTypeUID(BINDING_ID, channelId);
    }
}
