package com.dh.servlet;

import com.dh.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;


@WebServlet("/studentLogin")
public class Login extends HttpServlet {

    String username_html = null;
    String password_html = null;
    SqlSession sqlSession = null;
    int judge_is_ture = 0;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        username_html = req.getParameter("username");
        password_html = req.getParameter("pwd");
        sqlSession = MybatisUtil.getSession();
        String username = sqlSession.selectOne("selectStudentByName",username_html);
        String password = sqlSession.selectOne("selectStudentByPassword",password_html);

        if (username.equals(username_html)&&password.equals(password_html)){
            judge_is_ture++;
        }

        if (judge_is_ture == 1){
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
