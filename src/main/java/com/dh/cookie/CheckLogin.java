package com.dh.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class CheckLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        String userName = null;
        String pwd = null;

        for (Cookie cookie :cookies){
            String cookieName = cookie.getName();
            if ("username".equals(cookieName)){
                userName = cookie.getValue();
            }
            if ("pwd".equals(cookieName)){
                pwd = cookie.getValue();
            }
        }

        if ("zhangsan".equals(userName) && "123".equals(pwd)){
            resp.sendRedirect("/servlet_01_javaweb_war/success.html");
        }else {
            resp.sendRedirect("/servlet_01_javaweb_war/lg.html");
        }
    }

}
