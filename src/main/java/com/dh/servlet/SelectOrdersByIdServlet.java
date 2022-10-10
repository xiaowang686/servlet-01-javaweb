package com.dh.servlet;

import com.dh.entity.OrdersUser;
import com.dh.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SelectOrdersByIdServlet")
public class SelectOrdersByIdServlet extends HttpServlet {

    StudentServiceImpl studentServiceimpl = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        OrdersUser ordersUser = studentServiceimpl.selectByOrderId(6);
        System.out.println(ordersUser);
    }
}
