package com.masal;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Author: Masoud
 * Date: 6/1/16
 * Time: 6:53 PM
 */
public class ConnectionManager {
    public static ConnectionManager connectionManager;
    private Connection connection;
    private ConnectionManager() {
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream(new File(getClass().getClassLoader().getResource("db_config.properties").getFile()));
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");

        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/" + prop.get("dbName").toString() ,prop.get("username").toString(), prop.get("pass").toString());
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }

    }

    public static ConnectionManager getInstance() {
        if (connectionManager == null) {
            connectionManager = new ConnectionManager();
        }
        return connectionManager;
    }

    public Connection getConnection() {
        return connection;
    }
}
