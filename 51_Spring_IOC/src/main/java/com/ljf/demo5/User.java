package com.ljf.demo5;

import lombok.Data;

/**
 * @author: ljf
 * @create: 2021-02-25 11:00
 * @description:
 **/

public class User {

    private String name;

    public User() {
        System.out.println("默认调用无参构造器");
    }

    public User(String name) {

        System.out.println("有参构造器");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("通过set方式注入");
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
