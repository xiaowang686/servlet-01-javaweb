package com.dh.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class Servlet03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        String contextName = context.getServletContextName();
//        System.out.println(contextName);
//
//        String value = context.getInitParameter("name");
//        System.out.println(value);
//
//        context.setAttribute("小的","1");
//        Object name = context.getAttribute("小的");
//        System.out.println(name);
//        System.out.println();
//
//        Enumeration names = context.getInitParameterNames();
//        Enumeration enumeration = context.getAttributeNames();
//
//        while (names.hasMoreElements()){
//            System.out.println(names.nextElement());
//        }
//        System.out.println();
//
//        while (enumeration.hasMoreElements()){
//            System.out.println(enumeration.nextElement());
//        }

        //String path = "conf.properties";
        //String path = "/conf.properties";
        String path = Servlet03.class.
                getClassLoader().getResource("conf.properties").getPath();
        System.out.println(path);

    }
}
