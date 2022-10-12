package com.dh.servlet;

import com.dh.entity.User;
import com.dh.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;


@WebServlet("/selectUserById2")
public class SelectUserById2 extends HttpServlet {

    StudentServiceImpl studentServiceImpl = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("id",2);
        User user = studentServiceImpl.selectUserById2(map);
        System.out.println(user);
    }
}
