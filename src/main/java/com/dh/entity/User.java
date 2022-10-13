package com.dh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
    @Value("1")
    private Integer id;
    @Value("张三")
    private String username;
    private Date birthday;
    @Value("男")
    private String sex;
    @Value("深圳")
    private String address;
    private List<Orders> ordersList;

}
