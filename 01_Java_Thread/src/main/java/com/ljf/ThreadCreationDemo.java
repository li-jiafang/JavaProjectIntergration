package com.ljf;

import org.junit.jupiter.api.Test;

/**
 * @program: JavaProjectIntergration
 * @author: ljf
 * @create: 2021-02-18 16:03
 * @description: 线程创建
 **/
public class ThreadCreationDemo {


    /**
     * 方式一: 创建类继承Thread类
     * start方法是新建一个线程
     * run方法是实现内部类
     */
    @Test
    public void ThreadCreationOne(){
        ThreadTypeA threadTypeA = new ThreadTypeA();
        threadTypeA.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("方法: ThreadCreationOne"+  i);
        }
    }

}
