package com.dh.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcConnection {

    private static Connection conn = null;

    public static Connection mySqljdbccon(){
        String user = "root";
        String password = "123456";
        String url = "jdbc:mysql://localhost:3306/ceshi";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }


}
