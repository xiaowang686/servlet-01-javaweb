package com.dh.service;

import com.dh.entity.Orders;
import com.dh.entity.OrdersUser;
import com.dh.entity.Student;
import com.dh.entity.Students;

import java.util.List;

public interface StudentService {

    Students selectStudentByName(String username,String password);

    List<Student> selectForeach(Student student);

    OrdersUser selectByOrderId(int id);
}
