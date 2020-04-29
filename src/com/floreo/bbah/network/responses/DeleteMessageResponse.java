package com.floreo.bbah.network.responses;

import de.ralleytn.simple.json.JSONObject;

public class DeleteMessageResponse extends Response {

    private String channel;
    private String ts;

    public DeleteMessageResponse(JSONObject json) {
        super(json);

        if (json.get("channel") != null) {
            this.channel = (String) json.get("channel");
        }

        if (json.get("ts") != null) {
            this.ts = (String) json.get("ts");
        }
    }

    public String getChannel() {
        return channel;
    }

    public String getTs() {
        return ts;
    }
}