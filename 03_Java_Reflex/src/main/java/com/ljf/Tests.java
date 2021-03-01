package com.ljf;

import org.junit.jupiter.api.Test;

import java.net.URL;

/**
 * @author: ljf
 * @create: 2021-02-26 14:36
 * @description: 什么叫反射
 **/
public class Tests {

    public static void main(String[] args) {
        try {

            // 动态加载类的class对象
            Class c1 = Class.forName("com.ljf.User");
            System.out.println(c1.hashCode());

            Class c2 = Class.forName("com.ljf.User");
            System.out.println(c2.hashCode());

            Class c3 = Class.forName("com.ljf.User");
            System.out.println(c3.hashCode());

            Class c4 = Class.forName("com.ljf.User");
            System.out.println(c4.hashCode());

            //User user = new User();
            //System.out.println(user.getClass().hashCode());

            Class c5 = User.class;

            System.out.println(c5.hashCode());

            // 得到结果,所有类的hashCode值是相同的
            // 说明 一个类在内存中只有一个class对象
            // 一个类被加载后,那么这个类的整个结构都会被封装在class对象中
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test1(){

    }
}
