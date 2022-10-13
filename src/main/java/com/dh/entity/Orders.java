package com.dh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class Orders {

    private Integer id;
    private Integer user_id;
    private Integer number;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createtime;

    private User user;

    public Orders() {
        System.out.println("对象创建了");
    }

    public Orders(Integer id, Integer user_id, Integer number, Date createtime, User user) {
        this.id = id;
        this.user_id = user_id;
        this.number = number;
        this.createtime = createtime;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", number=" + number +
                ", createtime=" + createtime +
                ", user=" + user +
                '}';
    }
}
