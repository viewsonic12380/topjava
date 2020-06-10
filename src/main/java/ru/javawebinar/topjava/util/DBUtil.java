package ru.javawebinar.topjava.util;

import java.sql.Connection;

public class DBUtil {
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null)
            return connection;
        else
            return connection;
    }
}
