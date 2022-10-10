package com.dh.entity;

import java.util.Arrays;
import java.util.Date;

public class Student {

    private Integer id;
    private String name;
    private String sex;
    private Date birthday;
    private String department;
    private String address;
    private int[] ids;

    public Student() {

    }

    public Student(Integer id, String name, String sex, Date birthday, String department, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.department = department;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int[] getIds() {
        return ids;
    }

    public void setIds(int[] ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", department='" + department + '\'' +
                ", address='" + address + '\'' +
                ", ids=" + Arrays.toString(ids) +
                '}';
    }
}
