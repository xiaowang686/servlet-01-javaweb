package com.dh.cookie;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login")
public class Login extends HttpServlet {

    private static Logger logger = Logger.getLogger(Login.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        boolean tenDay = req.getParameter("tenDays")!=null?true:false;
        logger.info("====================login======================");
        logger.info(username);

        if ("zhangsan".equals(username)&&"123".equals(pwd)){
            if (tenDay){
                Cookie cookie1 = new Cookie("username",username);
                Cookie cookie2 = new Cookie("pwd",pwd);
                cookie1.setPath(req.getContextPath());
                cookie2.setPath(req.getContextPath());
                cookie1.setMaxAge(100);
                cookie2.setMaxAge(100);
                resp.addCookie(cookie1);
                resp.addCookie(cookie2);
            }
            resp.sendRedirect("/servlet_01_javaweb_war/success.html");
        }else {
            resp.sendRedirect("/servlet_01_javaweb_war/fail.html");
        }

    }
}
