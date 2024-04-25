package org.example.datasource.dataUtil;

import java.util.Properties;

public final class PropertiesUtil {

    private final static Properties PROPERTIES = new Properties();

    private PropertiesUtil() {}

    static {
        loadProperties();
    }

    private static void loadProperties() {

        PROPERTIES.put("db.url", "jdbc:postgresql://localhost:5431/meals_db");
        PROPERTIES.put("db.username", "post");
        PROPERTIES.put("db.password", "pass");
    }

    public static String get(String key) {
        return PROPERTIES.getProperty(key);
    }
}
