package com.dh.servlet;

import com.dh.entity.Student;
import com.dh.entity.Students;
import com.dh.service.impl.StudentServiceImpl;
import com.dh.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet("/studentLogin")
public class Login extends HttpServlet {

    String username_html = null;
    String password_html = null;
    int judge_is_ture = 0;
    StudentServiceImpl studentService = new StudentServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("utf-8");
        username_html = req.getParameter("username");
        password_html = req.getParameter("password");

        Students students = studentService.selectStudentByName(username_html,password_html);

        if (students.getUsername().equals(username_html) &&students.getPassword().equals(password_html)){
            judge_is_ture++;
        }

        if (judge_is_ture==1){
            resp.sendRedirect("/servlet_01_javaweb_war/success.html");
        }else {
            resp.sendRedirect("/servlet_01_javaweb_war/fail.html");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
