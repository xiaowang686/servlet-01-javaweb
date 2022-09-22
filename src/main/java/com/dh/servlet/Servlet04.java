package com.dh.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Servlet04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Enumeration en = req.getHeaderNames();
        while (en.hasMoreElements()){
            String names = (String) en.nextElement();
        }

        Map map = new HashMap();
        map = req.getParameterMap();
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey());
        }
        String[] strings = req.getParameterValues("name");
        int size = Array.getLength(strings);
        for (int i = 0;i<size;i++){
            System.out.println(strings[i]);
        }
    }

}
