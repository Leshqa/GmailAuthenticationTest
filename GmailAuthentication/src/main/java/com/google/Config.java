package com.google;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    public static User user;
    public static String BASE_URL;

    private static void init() {
        Properties properties = loadProperties("src/main/resources/properties");
        user = new User(properties.getProperty("user.name"), properties.getProperty("user.password"));
        BASE_URL = properties.getProperty("base.url");
    }

    private static Properties loadProperties(String path) {
        Properties properties = new Properties();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(path);
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return properties;
    }

    static {
        init();
    }
}
