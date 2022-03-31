package com.springBoot.task3.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static final String url = "jdbc:mysql://localhost:3306/my_org";
    private static final String username = "root";
    private static final String password = "qwertyui";
    private static Connection connection = null;

    private DatabaseConnection() {

    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(url, username, password);
                System.out.println("Connected to database server "
                        + connection.getMetaData().getDatabaseProductName()
                        + " version: "
                        + connection.getMetaData().getDatabaseProductVersion());
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    }
}
