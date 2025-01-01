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

import java.util.HashMap;
import java.util.Map;

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

    public static final String BINDING_ID = "nina";

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_NINA = new ThingTypeUID(BINDING_ID, "nina");

    // List of all Channel ids
    public static final String WARNING_CHANNEL = "warning";
    public static final String VERSION_CHANNEL = "version";
    public static final String TYPE_CHANNEL = "type";
    public static final String HEADLINE_CHANNEL = "headline";
    public static final String DESCRIPTION_CHANNEL = "description";
    public static final String PROVIDER_CHANNEL = "provider";
    public static final String SEVERITY_CHANNEL = "severity";
    public static final String MSG_TYPE_CHANNEL = "msgType";
    public static final String URGENCY_CHANNEL = "urgency";
    public static final String EVENT_CHANNEL = "event";
    public static final String SENT_CHANNEL = "sent";
    public static final String CATEGORY_CHANNEL = "category";
    public static final String SENDER_CHANNEL = "sender";
    public static final String STATUS_CHANNEL = "status";
    public static final String SCOPE_CHANNEL = "scope";
    public static final String IDENTIFIER_CHANNEL = "identifier";
    public static final String CERTAINTY_CHANNEL = "certainty";

    public static final Map<String, String> channelMap = new HashMap<>();
    static {
        channelMap.put(HEADLINE_CHANNEL, "Headline");
        channelMap.put(VERSION_CHANNEL, "Version");
        channelMap.put(TYPE_CHANNEL, "Type");
        channelMap.put(PROVIDER_CHANNEL, "Provider");
        channelMap.put(SEVERITY_CHANNEL, "Severity");
        channelMap.put(MSG_TYPE_CHANNEL, "MsgType");
        channelMap.put(SENT_CHANNEL, "Sent");
        channelMap.put(DESCRIPTION_CHANNEL, "Description");
        channelMap.put(URGENCY_CHANNEL, "Urgency");
        channelMap.put(CATEGORY_CHANNEL, "Category");
        channelMap.put(EVENT_CHANNEL, "Event");
        channelMap.put(SENDER_CHANNEL, "Sender");
        channelMap.put(STATUS_CHANNEL, "Status");
        channelMap.put(SCOPE_CHANNEL, "Scope");
        channelMap.put(CERTAINTY_CHANNEL, "Certainty");
        channelMap.put(IDENTIFIER_CHANNEL, "ID");
    }
}
