package com.dh.dao;

import com.dh.entity.Orders;
import com.dh.entity.Student;
import com.dh.entity.Students;
import com.dh.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {

    Students selectStudentByName(@Param("username") String username, @Param("password") String password);

    List<Student> selectForeach(Student student);

    Orders selectByOrderId(int id);

    User selectUserById(int id);

    Orders selectOrder(int id);
}
