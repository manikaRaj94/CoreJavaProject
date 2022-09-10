package com.javaproject.coding.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    public static void connectionUsingHardCode() {
        Connection connection = null;
        try {
            String url1 = "jdbc:mysql://localhost:3306/contact_db";
            String user = "root";
            String password = "mraj";
            connection = DriverManager.getConnection(url1, user, password);
            if (connection != null) {
                System.out.println("Connected to the database contact_db");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void connectionUsingUrl() throws SQLException {
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/contact_db?user=root&password=mraj";
        connection = DriverManager.getConnection(url);
        if (connection != null) {
            System.out.println("Connected to the database contact_db");
        }
    }

    public static  Connection connectionUsingProperty() throws IOException, SQLException {
        Connection connection = null;
        Properties props = new Properties();
        FileInputStream file = new FileInputStream("C:\\MyFiles\\Manika\\eMexoJava\\CoreJavaProjects\\src\\main\\resources\\db.properties");
        props.load(file);

        connection = DriverManager.getConnection(props.getProperty("DB_URL"),
                props.getProperty("DB_USERNAME"),
                props.getProperty("DB_PASSWORD"));
        if (connection != null) {
            System.out.println("Connected to the database contact_db");
        }
        return connection;
    }
}
