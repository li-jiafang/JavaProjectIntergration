package com.ljf.demo3;

import com.ljf.demo1.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: ljf
 * @create: 2021-04-15 12:28
 * @description:
 **/
public class Test3 {

    public static void main(String[] args) {
        // 获取对象hello
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo3.xml");
        Hello hello = applicationContext.getBean("hello", Hello.class);
        System.out.println(hello);


        // 获取组装对象

        UserServiceImpl userServiceImpl = applicationContext.getBean("userServiceImpl", UserServiceImpl.class);
        userServiceImpl.getUserInfo();
    }
}
