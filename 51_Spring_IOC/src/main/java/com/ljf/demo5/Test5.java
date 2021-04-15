package com.ljf.demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: ljf
 * @create: 2021-04-15 12:38
 * @description:
 * IOC创建对象的几种方式
 * 使用无参构造器创建对象,默认
 * 使用有参构造器创建对象,
 * 1.下标赋值
 * 2.类型创建(不推荐使用,如何参数包含多个String类型,如何确定是固定类型)
 * 3.直接通过参数名来创建对象(推荐使用)
 *
 *  bean的作用域 默认是singleton(单例模式)
 **/
public class Test5 {
    public static void main(String[] args) {



        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo5.xml");

//        User user = (User) applicationContext.getBean("user");
//
//        System.out.println(user);

        User user2 = (User) applicationContext.getBean("userNew3");

        System.out.println(user2);
    }
}
