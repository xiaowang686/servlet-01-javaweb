package com.dh.servlet;

import com.dh.entity.User;

<<<<<<< HEAD
import javax.servlet.RequestDispatcher;
=======
>>>>>>> origin/master
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
<<<<<<< HEAD
        this.doPost(req,resp);
    }
=======
        super.doGet(req, resp);
    }

>>>>>>> origin/master
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        Date date ;
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM--dd");
        try {
<<<<<<< HEAD
            String name = req.getParameter("name");
            int age = Integer.parseInt(req.getParameter("age"));
            String address = req.getParameter("address");
            date = sdf.parse(req.getParameter("birthday"));
            String[] hobby = req.getParameterValues("hobby");
            boolean accept = req.getParameter("accept").equals("true")?true:false;
            user.setName(name);
            user.setAge(age);
            user.setAddress(address);
            user.setBirthday(date);
            user.setHobby(hobby);
            user.setAccept(accept);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(user);
        req.getRequestDispatcher("/servlet03").forward(req,resp);
    }



    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

=======
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
>>>>>>> origin/master
    }
}