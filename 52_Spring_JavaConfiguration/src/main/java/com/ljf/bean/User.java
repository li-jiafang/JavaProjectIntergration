package com.ljf.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author: ljf
 * @create: 2021-02-25 17:38
 * @description:
 **/
@Component
public class User {

    //@Value("张三")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
