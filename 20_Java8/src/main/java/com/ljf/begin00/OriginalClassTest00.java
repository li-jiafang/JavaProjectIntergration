package com.ljf.begin00;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ljf
 * @create: 2021-03-17 10:44
 * @description:
 *
 * 传统筛选获取条件的方式
 **/
public class OriginalClassTest00 {

    /**
     * 传统做法
     * 根据list筛选红色的苹果
     */
    @Test
    public void test1() {
        List<Apple> appleList = processList();
        for (Apple apple : appleList) {
            if ("红色".equals(apple.getColor())){
                System.out.println(apple);
            }
        }

    }


    /**
     * 传统做法
     * 根据list筛选绿色的苹果
     */
    @Test
    public void test2() {
        List<Apple> appleList = processList();
        for (Apple apple : appleList) {
            if ("绿色".equals(apple.getColor())){
                System.out.println(apple);
            }
        }

    }

    // 代码重复,唯一改变的只是参数条件,所以我们可以选择让用户传递条件

    @Test
    public void test3() {
        List<Apple> appleList = processList();
        List<Apple> appleList1 = filterApplesByColor(appleList, "红色");
        List<Apple> appleList2 = filterApplesByColor(appleList, "绿色");
        System.out.println(appleList1);
        System.out.println(appleList2);

    }
    public static List<Apple> filterApplesByColor(List<Apple> inventory,
                                                  String color) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple: inventory){
            if ( apple.getColor().equals(color) ) {
                result.add(apple);
            }
        }
        return result;
    }


    // 这样做代码确实简化了,但发现一个新的问题,只能传递同一个参数条件,复用性还是太低
    // 假如用户需要红色且价格等于10的苹果呢,需求变化太快


    // 如下这个方式,是最糟糕的代码,true和false是什么意思？
    // 代码结构混乱,无法确定flag标记位用于什么判断条件
    @Test
    public void test4() {
        List<Apple> appleList = processList();
        List<Apple> appleList1 = filterApples(appleList, "红色",10D,false);
        List<Apple> appleList2 = filterApples(appleList, "绿色",20,false);
        System.out.println(appleList1);
        //System.out.println(appleList2);

    }
    public static List<Apple> filterApples(List<Apple> inventory, String color, double price, boolean flag) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple: inventory){
            if ( (flag && apple.getColor().equals(color)) || (!flag && apple.getPrice() == price) ){
                result.add(apple);
            }
        }
        return result;
    }


    /**
     * 调整新的实现方式,抽象化接口,增加新的实现方式
     *
     */
    @Test
    public void test5() {
        List<Apple> appleList = processList();
        List<Apple> appleList1 = filterApples(appleList,new PriceFilterImpl());
        List<Apple> appleList2 = filterApples(appleList, new ColorFilterImpl());
        System.out.println("appleList1:"+appleList1);
        System.out.println("appleList2:"+appleList2);

    }

    public static List<Apple> filterApples(List<Apple> inventory,Filter filter) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple: inventory){
            if (filter.filter(apple)){
                result.add(apple);
            }
        }
        return result;
    }







    private List<Apple> processList() {
        List<Apple> appleList = new ArrayList<>();
        Apple apple1 = new Apple(1, "富士山1", "红色", 20D);
        Apple apple2 = new Apple(2, "富士山2", "绿色", 10D);
        Apple apple3 = new Apple(3, "富士山3", "黄色", 25D);
        appleList.add(apple1);
        appleList.add(apple2);
        appleList.add(apple3);
        return appleList;
    }


}
