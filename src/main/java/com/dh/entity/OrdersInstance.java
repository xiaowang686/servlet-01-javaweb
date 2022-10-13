package com.dh.entity;

public class OrdersInstance {

    /**
     * 使用静态工厂方法创建实例
     * @return
     */

    public static Orders getInstance(){
        return new Orders();
    }

    public Orders getInstance1(){
        return new Orders();
    }
}
