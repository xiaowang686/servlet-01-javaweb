package com.dh.entity;

import java.util.Arrays;
import java.util.Date;

public class User {

    private String name;
    private Integer age;
    private Date birthday;
    private String address;
    private String[] hobby;
    private boolean accept;

    public User() {
    }

    public User(String name, Integer age, Date birthday, String address, String[] hobby, boolean accept) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
        this.hobby = hobby;
        this.accept = accept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public boolean isAccept() {
        return accept;
    }

    public void setAccept(boolean accept) {
        this.accept = accept;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                ", accept=" + accept +
                '}';
    }
}
