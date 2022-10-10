package com.dh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdersUser {

    private int id;
    private int userid;
    private int number;
    private Date createtime;
    private String note;
    private int uid;
    private String username;
    private Date birthday;
    private String sex;
    private String address;

}
