package com.dh.jdbc;

import com.dh.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Demo1 extends Thread{
    SqlSession sqlSession;
    String resource = "mybatis-config.xml";
    @Override
    public void run() {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = format.parse("1999-9-9");
            InputStream in = Resources.getResourceAsStream(resource);
            sqlSession = new SqlSessionFactoryBuilder().build(in).openSession();
            Student student = new Student();
            student.setId(908);
            student.setName("猪猪");
            student.setSex("女");
            student.setBirthday(date);
            student.setDepartment("中文系");
            student.setAddress("广西南宁市");
//            sqlSession.insert("insertStudent",student);
//            sqlSession.commit();

            List<Student> lists = sqlSession.selectList("selectStudentAll");
            for (Student list:lists){
                System.out.println(list);
            }
            //System.out.println(student);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
