package com.ljf.constant;

import com.ljf.begin00.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ljf
 * @create: 2021/4/29 16:58
 * @description:
 **/
public class Constant {


    public static List<Apple> processList() {
        List<Apple> appleList = new ArrayList<>();
        Apple apple1 = new Apple(1, "富士山1", "红色", 20D);
        Apple apple2 = new Apple(2, "富士山2", "绿色", 10D);
        Apple apple3 = new Apple(2, "富士山4", "绿色", 10D);
        Apple apple4 = new Apple(3, "富士山3", "黄色", 25D);
        appleList.add(apple1);
        appleList.add(apple2);
        appleList.add(apple3);
        appleList.add(apple4);
        return appleList;
    }
}
