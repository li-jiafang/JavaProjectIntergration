package com.ljf;

/**
 * @author: ljf
 * @create: 2021-02-26 16:08
 * @description:
 **/
public class Test05 {

    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.m);

    }


}


class A{
    // 静态代码块
    static {
        System.out.println("第一个静态代码块初始化");
        m = 300;
    }

    static int m = 0;

    static {
        System.out.println("第二个静态代码块初始化");
        m = 400;
    }

    public A() {
        System.out.println("无参构造方法创建");
    }
}