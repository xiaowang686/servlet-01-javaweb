package com.dh.jdbc;

import org.apache.log4j.Logger;

import java.sql.*;

public class JDBC01 {

    private static Logger logger = Logger.getLogger(JDBC01.class);

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement ps =null;
        ResultSet rs =null;
        try {
           conn = jdbcConnection.mySqljdbccon();
            ps = conn.prepareStatement("select * from student");
            rs = ps.executeQuery();
            while (rs.next()){
                logger.info(rs.getInt("id"));
                logger.info(rs.getString("name"));
                logger.info(rs.getString("sex"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (rs!=null){
                try {
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (ps!=null){
                try {
                    ps.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
