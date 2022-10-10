package com.dh.servlet;

import com.dh.entity.Student;
import com.dh.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/selectForeach")
public class SelectForEachServlet extends HttpServlet {

    StudentServiceImpl studentService = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = new Student();
        int[] ids = {901,902,903,904,905};
        student.setIds(ids);
        List<Student> lists = studentService.selectForeach(student);
        for (Student student2:lists){
            System.out.println(student2);
        }
    }

}
