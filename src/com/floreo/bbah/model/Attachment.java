package com.floreo.bbah.model;
import de.ralleytn.simple.json.JSONObject;
import de.ralleytn.simple.json.JSONArray;
import de.ralleytn.simple.json.JSONParseException;
import de.ralleytn.simple.json.JSONParser;


/**
 *
 * A class representing a message attachment.
 * See https://api.slack.com/docs/message-attachments
 *
 */

public class Attachment {

    // Implement private fields for each of the following user JSON keys:
    private String fallBack;
    private String color;
    private String pretext;
    private String authorName;
    private String authorLink;
    private String authorIcon;
    private String title;
    private String titleLink;
    private String text;
    private String fields;
    private String imageUrl;
    private String thumbUrl;
    private String footer;
    private String footerIcon;
    private String ts;

    public Attachment(JSONObject json) {
        // Parse an attachment from the incoming json

        String jsonSRC;
        JSONObject object = new JSONObject(json);

        Object[] myJSONArrayString = new Object[0];
        JSONArray array = new JSONArray(myJSONArrayString);

        for(Object element : array) {

            System.out.println(element);
        }

    }

    // Add getters to access private fields
    public String getFallBack() {
        return fallBack;
    }
    public String getColor() {
        return color;
    }
    public String getPretext() {
        return pretext;
    }
    public String getAuthorName() {
        return authorName;
    }
    public String getAuthorLink() {
        return authorLink;
    }
    public String getAuthorIcon() {
        return authorIcon;
    }
    public String getTitle() {
        return title;
    }
    public String getTitleLink() {
        return titleLink;
    }
    public String getText() {
        return text;
    }
    public String getFields() {
        return fields;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public String getThumbUrl() {
        return thumbUrl;
    }
    public String getFooter() {
        return footer;
    }
    public String getFooterIcon() {
        return footerIcon;
    }
    public String getTs() {
        return ts;
    }

}