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
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.library.types.StringType;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingStatus;
import org.openhab.core.thing.ThingStatusDetail;
import org.openhab.core.thing.binding.BaseThingHandler;
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

    private String url = "http://localhost";

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
            pollingCode();
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
        this.url = config.serverUrl + "/dashboard/" + config.ars + ".json";
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

        // Example for background initialization:
        refreshJob = scheduler.scheduleWithFixedDelay(this::pollingCode, 0, config.refreshInterval, TimeUnit.SECONDS);

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

    private void pollingCode() {
        try {
            ContentResponse response = this.httpClient
                    .newRequest(config.serverUrl + "/dashboard/" + config.ars + ".json")
                    .timeout(5000, TimeUnit.MILLISECONDS).send();
            if (response.getStatus() == HttpStatus.OK_200) {
                logger.debug("Received response: {}", response.getContentAsString());
                ARSOverviewResultInner[] result = this.gson.fromJson(response.getContentAsString(),
                        ARSOverviewResultInner[].class);
                for (ARSOverviewResultInner inner : result) {
                    String innerString = inner.toString();
                    logger.debug(innerString);
                    pollingWarningDetails(inner.getId());
                }
                updateStatus(ThingStatus.ONLINE);
                updateState(HEADLINE_CHANNEL, new StringType(result[0].getPayload().getData().getHeadline()));
                updateState(VERSION_CHANNEL, new DecimalType(result[0].getPayload().getVersion()));
                updateState(TYPE_CHANNEL, new StringType(result[0].getPayload().getData().getHeadline()));
                updateState(PROVIDER_CHANNEL, new StringType(result[0].getPayload().getData().getProvider()));
                updateState(SEVERITY_CHANNEL, new StringType(result[0].getPayload().getData().getSeverity()));
                updateState(MSG_TYPE_CHANNEL, new StringType(result[0].getPayload().getData().getMsgType()));
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
    }

    private void pollingWarningDetails(String id) {
        try {
            ContentResponse response = this.httpClient.newRequest(config.serverUrl + "/warnings/" + id + ".json")
                    .timeout(5000, TimeUnit.MILLISECONDS).send();
            if (response.getStatus() == HttpStatus.OK_200) {
                logger.debug("Received response: {}", response.getContentAsString());
                Warning result = this.gson.fromJson(response.getContentAsString(), Warning.class);
                String innerString = result.toString();
                logger.debug(innerString);
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
    }
}
