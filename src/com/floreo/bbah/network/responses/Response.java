package com.floreo.bbah.network.responses;

import de.ralleytn.simple.json.JSONObject;

/**
 * A class representing a response from Slack's Web API.
 * See https://api.slack.com/methods/api.test
 *
 */

public class Response {

    private boolean ok;
    private String error;

    public Response(JSONObject json) {
        if (json.get("ok") != null) {
            this.ok = (Boolean) json.get("ok");
        }

        if (json.get("error") != null) {
            this.error = (String) json.get("error");
        }
    }

    public boolean isOk() {
        return ok;
    }

    public String getError() {
        return error;
    }
}