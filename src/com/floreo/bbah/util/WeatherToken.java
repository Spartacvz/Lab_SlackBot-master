package com.floreo.bbah.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherToken {


    public static String findWeatherApiToken() {

        String apiKey = "";

        File file = new File("weatherApiToken.txt");
        System.out.println(file.getAbsolutePath());

        try {

            Scanner scanner = new Scanner(file);

            apiKey = scanner.next();

            scanner.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }

        return apiKey;
    }
}
