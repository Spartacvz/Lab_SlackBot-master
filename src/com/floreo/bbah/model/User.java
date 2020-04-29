package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;
import de.ralleytn.simple.json.JSONParseException;

/**
 *
 * A class representing a user.
 * See https://api.slack.com/types/user
 *
 */

public class User {

    // Implement private fields for each of the following user JSON keys:
    private String id;
    private String name;
    private String deleted;
    private String color;
    private String profile;
    private boolean is_admin;
    private boolean is_owner;
    private boolean is_primary_owner;
    private boolean is_restricted;
    private boolean is_ultra_restricted;
    private boolean has_2fa;
    private String wo_factor_type;
    private boolean has_files;

    public User(JSONObject json) throws JSONParseException {
        // Parse a user from the incoming json

        try{
            String jsonStr = "{}";
            JSONObject obj = new JSONObject(jsonStr);
            String n = obj.getString("name");
        } catch (JSONParseException e) {
            e.printStackTrace();
        }


    }

    // Add getters to access private fields
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDeleted() {
        return deleted;
    }
    public String getColor() {
        return color;
    }
    public String getProfile() {
        return profile;
    }
    public boolean getIsAdmin() {
        return is_admin;
    }
    public boolean getIsOwner() {
        return is_admin;
    }
    public boolean getIsPrimaryOwner() {
        return is_primary_owner;
    }
    public boolean getIs_Restricted() {
        return is_restricted;
    }
    public boolean getIsUltraRestricted() {
        return is_ultra_restricted;
    }
    public boolean getHas2Fa() {
        return has_2fa;
    }
    public String getWo_factor_type() {
        return wo_factor_type;
    }
    public boolean getHasFiles() {
        return has_files;
    }

}