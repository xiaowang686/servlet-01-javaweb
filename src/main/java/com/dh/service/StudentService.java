package com.dh.service;

import com.dh.entity.Orders;
import com.dh.entity.Student;
import com.dh.entity.Students;
import com.dh.entity.User;

import java.util.List;

public interface StudentService {

    Students selectStudentByName(String username,String password);

    List<Student> selectForeach(Student student);

    Orders selectByOrderId(int id);

    User selectUserById(int id);

    Orders selectOrder(int id);
}
