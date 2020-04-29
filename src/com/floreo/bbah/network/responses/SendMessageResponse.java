package com.floreo.bbah.network.responses;

import com.floreo.bbah.model.Message;
import de.ralleytn.simple.json.JSONObject;

/**
 * A class representing the response from chat.postMessage
 * See https://api.slack.com/methods/chat.postMessage
 *
 */
public class SendMessageResponse extends Response {

    private String channel;
    private String ts;
    private Message message;

    public SendMessageResponse(JSONObject json) {
        super(json);

        if (json.get("channel") != null) {
            this.channel = (String) json.get("channel");
        }

        if (json.get("ts") != null) {
            this.ts = (String) json.get("ts");
        }

        if (json.get("message") != null) {
            this.message = new Message((JSONObject) json.get("message"));
        }
    }

    public String getChannel() {
        return channel;
    }

    public String getTs() {
        return ts;
    }

    public Message getMessage() {
        return message;
    }
}