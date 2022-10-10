package com.dh.entity;

import java.util.Date;

public class Orders {

    private Integer id;
    private Integer user_id;
    private Integer number;
    private Date createtime;

    public Orders() {
    }

    public Orders(Integer id, Integer user_id, Integer number, Date createTime) {
        this.id = id;
        this.user_id = user_id;
        this.number = number;
        this.createtime = createTime;
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

    public Date getCreateTime() {
        return createtime;
    }

    public void setCreateTime(Date createTime) {
        this.createtime = createTime;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", number=" + number +
                ", createTime=" + createtime +
                '}';
    }
}
