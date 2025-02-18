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

import java.net.MalformedURLException;
import java.net.URL;

/**
 * The {@link NinaConfiguration} class contains fields mapping thing configuration parameters.
 *
 * @author Andre Krautschick - Initial contribution
 */
// @NonNullByDefault
public class NinaConfiguration {

    private String serverUrl;
    private int minNumberWarningSets;
    private int maxNumberWarningSets;
    private int refreshInterval;
    private String ars;

    public String getServerUrl() {
        return serverUrl;
    }

    public int getMinNumberWarningSets() {
        return minNumberWarningSets;
    }

    public int getMaxNumberWarningSets() {
        return maxNumberWarningSets;
    }

    public int getRefreshInterval() {
        return refreshInterval;
    }

    public String getArs() {
        return ars.substring(0, 5) + "0000000";
    }

    public boolean isValid() {
        // hostname must be entered and be a URI
        if ("".equals(serverUrl)) {
            return false;
        }
        try {
            new URL(serverUrl);
        } catch (MalformedURLException muex) {
            return false;
        }
        if ("".equals(ars)) {
            return false;
        }
        // refresh interval is positive integer
        return (refreshInterval > 0);
    }
}
