package com.finance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Driver;

public class DBConnection {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Driver d = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(d);
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/finance_db", "root", "root");
    }
}
