package com.ljf.demo2;

import com.ljf.demo2.bean.Car;
import com.ljf.demo2.bean.Wheel;

/**
 * @author: ljf
 * @create: 2021-04-15 12:10
 * @description:
 **/
public class SimpleIOCTest {

    public static void main(String[] args) throws Exception {
        String location = SimpleIOC.class.getClassLoader().getResource("demo2.xml").getFile();
        SimpleIOC bf = new SimpleIOC(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }
}
