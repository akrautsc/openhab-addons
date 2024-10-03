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

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.thing.ThingTypeUID;

/**
 * The {@link NinaBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Andre Krautschick - Initial contribution
 */
@NonNullByDefault
public class NinaBindingConstants {

    private static final String BINDING_ID = "nina";

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_NINA = new ThingTypeUID(BINDING_ID, "nina");

    // List of all Channel ids
    public static final String WARNING_CHANNEL = "warning";
    public static final String VERSION_CHANNEL = "version";
    public static final String TYPE_CHANNEL = "type";
    public static final String HEADLINE_CHANNEL = "headline";
    public static final String PROVIDER_CHANNEL = "provider";
    public static final String SEVERITY_CHANNEL = "severity";
    public static final String MSG_TYPE_CHANNEL = "msgType";
}
