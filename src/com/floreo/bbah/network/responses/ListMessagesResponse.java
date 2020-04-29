package com.floreo.bbah.network.responses;

import com.floreo.bbah.model.Message;
import de.ralleytn.simple.json.JSONArray;
import de.ralleytn.simple.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * A class representing the response from channels.history
 * See https://api.slack.com/methods/channels.history
 *
 */

public class ListMessagesResponse extends Response {

    private List<Message> messages;

    public ListMessagesResponse(JSONObject json) {
        super(json);

        if (json.containsKey("messages")) {
            JSONArray array = (JSONArray) json.get("messages");

            this.messages = new ArrayList<Message>();
            for (int i = 0; i < array.size(); i++) {
                this.messages.add(new Message((JSONObject) array.get(i)));
            }
        }
    }

    public List<Message> getMessages() {
        return messages;
    }
}