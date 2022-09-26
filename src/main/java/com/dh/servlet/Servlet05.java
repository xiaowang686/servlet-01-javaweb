package com.dh.servlet;

import com.dh.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Servlet05 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        Date date ;
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM--dd");
        try {
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String address = req.getParameter("address");
        date = sdf.parse(req.getParameter("birthday"));
        String[] hobby = req.getParameterValues("hobby");
        user.setName(name);
        user.setAge(age);
        user.setAddress(address);
        user.setBirthday(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
