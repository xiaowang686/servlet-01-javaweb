package com.dh.testBean.ss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserPojo {

    @Autowired
    @Qualifier("UserDaoImpl1")
    private UserService UserService;

    public UserService UserService() {
        return UserService;
    }

    public void UserService(UserService UserService) {
        this.UserService = UserService;
    }

    @Override
    public String toString() {
        return "UserPojo{" +
                "UserService=" + UserService +
                '}';
    }
}
