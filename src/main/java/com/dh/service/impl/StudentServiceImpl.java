package com.dh.service.impl;

import com.dh.dao.StudentDao;
import com.dh.entity.Orders;
import com.dh.entity.OrdersUser;
import com.dh.entity.Student;
import com.dh.entity.Students;
import com.dh.service.StudentService;
import com.dh.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    SqlSession sqlSession = MybatisUtil.getSession();;
    StudentDao studentDao = sqlSession.getMapper(StudentDao.class);

    @Override
    public Students selectStudentByName(String username, String password) {
        Students students = studentDao.selectStudentByName(username,password);
        return students;
    }

    @Override
    public List<Student> selectForeach(Student student) {
        List<Student> student1 = studentDao.selectForeach(student);
        return student1;
    }

    @Override
    public OrdersUser selectByOrderId(int id) {
        OrdersUser orders = studentDao.selectByOrderId(id);
        return orders;
    }
}