package com.dh.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class Servlet02 extends HttpServlet {
    //通过ServletConfig对象获取web.xml中信息
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig config = getServletConfig();

        String name = config.getServletName();
        System.out.println(name);

        String name1 = config.getInitParameter("name");
        System.out.println(name1);

        Enumeration enumeration = config.getInitParameterNames();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
