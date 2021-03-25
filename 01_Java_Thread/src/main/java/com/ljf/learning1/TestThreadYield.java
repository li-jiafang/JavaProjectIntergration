package com.ljf.learning1;

/**
 * @author: ljf
 * @create: 2021-03-25 12:15
 * @description:
 **/
public class TestThreadYield implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始执行");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"结束执行");
    }

    public static void main(String[] args) {
        TestThreadYield threadYield = new TestThreadYield();
        new Thread(threadYield,"a").start();
        new Thread(threadYield,"b").start();
        new Thread(threadYield,"c").start();
        new Thread(threadYield,"d").start();

    }
}
