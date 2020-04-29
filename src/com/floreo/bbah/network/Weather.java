package com.floreo.bbah.network;

import com.floreo.bbah.network.responses.*;
import com.floreo.bbah.util.Token;
import com.floreo.bbah.util.WeatherToken;
import de.ralleytn.simple.json.JSONObject;
import java.net.URL;

public class Weather {

    private static final String API_KEY = WeatherToken.findWeatherApiToken();
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q=";
    private static final String REQUEST_BY_CITY = "";
    private static final int REQUEST_BY_ZIP = 0;


    public static Response requestByCity() {
        URL testUrl = HTTPS.stringToURL(BASE_URL + REQUEST_BY_CITY + "&units=imperial" + "&appid=" + API_KEY);

        JSONObject object = HTTPS.get(testUrl);

        return new Response(object);
    }
    public static Response requestByZip() {
        URL testUrl = HTTPS.stringToURL(BASE_URL + REQUEST_BY_ZIP + "&units=imperial" + "&appid=" + API_KEY);

        JSONObject object = HTTPS.get(testUrl);

        return new Response(object);
    }
}