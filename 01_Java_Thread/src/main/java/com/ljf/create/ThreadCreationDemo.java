package com.ljf.create;

import org.junit.jupiter.api.Test;

/**
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

    /**
     * 方式二: 实现Runnable方法
     *
     */
    @Test
    public void ThreadCreationTwo(){
        ThreadTypeB threadTypeB = new ThreadTypeB();
        //threadTypeB.run();// 这种方式不是创建子线程,而是调用实现方法

        Thread thread = new Thread(threadTypeB);
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("父方法: ThreadCreationTwo"+  i);
        }
    }


    /**
     * 方式三: 匿名内部类创建线程
     */

    @Test
    public void ThreadCreationThree(){
        Runnable threadTypeC = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("子线程 threadTypeC : " + i);
                }
            }
        };
        Thread thread = new Thread(threadTypeC);
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("父方法: ThreadCreationThree"+  i);
        }

    }


}
