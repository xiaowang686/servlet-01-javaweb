package com.dh.servlet;

import com.dh.entity.User;
import com.dh.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SelectUserByOrderId")
public class SelectUserByOrderId extends HttpServlet {

    StudentServiceImpl studentServiceImpl = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = studentServiceImpl.selectOrder(8);
        System.out.println(user);
    }
}
