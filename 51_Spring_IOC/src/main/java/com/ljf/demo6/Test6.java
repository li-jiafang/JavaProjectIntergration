package com.ljf.demo6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: ljf
 * @create: 2021-04-15 12:39
 * @description:
 * bean的隐式自动装配
 **/
public class Test6 {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo6.xml");
        People people = applicationContext.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();
        System.out.println(people);
    }
}
