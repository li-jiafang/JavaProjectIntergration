package com.ljf.test;

import com.ljf.bean.User;
import com.ljf.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * @author: ljf
 * @create: 2021-02-25 17:44
 * @description:
 **/


public class Test {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        User user = (User) context.getBean("user");

        System.out.println(user.getName());
    }
}
