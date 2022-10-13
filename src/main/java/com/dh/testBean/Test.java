package com.dh.testBean;

import com.dh.testBean.ss.UserPojo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserPojo userPojo = applicationContext.getBean(UserPojo.class);
        System.out.println(userPojo);
    }
}
