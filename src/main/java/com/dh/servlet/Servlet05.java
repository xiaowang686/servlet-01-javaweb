package com.dh.servlet;

import com.dh.entity.User;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/test")
public class Servlet05 extends HttpServlet {

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        User user = new User();
//        Date date ;
//        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
//        req.setCharacterEncoding("utf-8");
//        try {
//            String name = req.getParameter("name");
//            int age = Integer.parseInt(req.getParameter("age"));
//            String address = req.getParameter("address");
//            date = sdf.parse(req.getParameter("birthday"));
//            String[] hobby = req.getParameterValues("hobby");
//            boolean accept = req.getParameter("accept")!=null?true:false;
//            user.setName(name);
//            user.setAge(age);
//            user.setAddress(address);
//            user.setBirthday(date);
//            user.setHobby(hobby);
//            user.setAccept(accept);
//            System.out.println(user);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        req.getRequestDispatcher("/index.jsp").forward(req,resp);
//    }

}
