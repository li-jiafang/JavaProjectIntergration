package com.ljf;

import org.junit.jupiter.api.Test;

import java.util.Locale;

/**
 * @author: ljf
 * @create: 2021-02-22 11:13
 * @description:
 **/
public class StringDemo {


    public static void main(String[] args) {

    }


    /**
     * 可以发现
     * String对象是不可变的
     * 每个对String对象值进行修改的方法,都是在创建一个新的String对象
     *
     * 将String对象作为参数传递,都是对String对象复制的引用,原本的对象还停留在原地址没有改变
     *
     *
     *
     *
     */
    @Test
    public void test(){
        String a = "hello";

        System.out.println(a);  // hello

        System.out.println(a.toUpperCase()); // HELLO

        System.out.println(a); // hello

    }

    @Test
    public void regularMatch(){

    }


    /**
     * 字符串比较
     */
    @Test
    public void compareStr(){

        System.out.println("abc" == "abc");

        System.out.println("abc" == "abc".substring(0,3));


        System.out.println(new String("c") == new String("c"));
        System.out.println(new String("c") .equals(new String("c")) );



        // 等号 和 equals之间的区别, 他们比较的究竟是什么

        //


    }




}
