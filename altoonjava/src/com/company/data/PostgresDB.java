package com.company.data;

import com.company.data.interfaces.IDB;

import java.sql.*;

public class PostgresDB implements IDB {
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:postgresql://localhost:3306/simpledb";
        try {
            // Here we load the driver’s class file into memory at the runtime
            Class.forName("com.mysql.jdbc.Driver");

            // Establish the connection
            Connection con = DriverManager.getConnection(connectionUrl, "ali", "0000");

            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}