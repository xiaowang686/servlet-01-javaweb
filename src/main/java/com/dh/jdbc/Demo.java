package com.dh.jdbc;

import com.dh.entity.Student;

import java.sql.*;

public class Demo extends Thread{
    private Connection conn= null;
    Student student = null;
    PreparedStatement ps= null;
    ResultSet rs = null;
    @Override
    public void run() {
        try{
        conn = jdbcConnection.mySqljdbccon();
        ps = conn.prepareStatement("select * from student");
        rs = ps.executeQuery();
        while (rs.next()){
            student = new Student();
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String sex = rs.getString("sex");
            Date birthday = rs.getDate("birth");
            String department = rs.getString("department");
            String address = rs.getString("address");

            student.setId(id);
            student.setName(name);
            student.setSex(sex);
            student.setBirthday(birthday);
            student.setDepartment(department);
            student.setAddress(address);

            System.out.println(student);
        }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(rs!=null){
                try {
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(ps!=null){
                try {
                    ps.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
