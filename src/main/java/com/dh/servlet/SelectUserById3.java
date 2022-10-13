package com.dh.servlet;

import com.dh.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.Map;
import java.util.Set;

@WebServlet("/SelectUserById3")
public class SelectUserById3 extends HttpServlet {

    StudentServiceImpl studentServiceImpl = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map map = studentServiceImpl.selectUserById3(3);
        Object name = map.get("username");
        System.out.println(name);

//        Iterator iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        Set set = map.entrySet();
        for (Object o:set){
            System.out.println(o);
        }
    }
}
