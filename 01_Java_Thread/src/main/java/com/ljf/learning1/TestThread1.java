package com.ljf.learning1;

/**
 * @author: ljf
 * @create: 2021-03-18 18:37
 * @description: 学习:
 * 多线程同步下载网络图片
 **/
public class TestThread1 implements Runnable {

    public static void main(String[] args) {
        TestThread1 testThread1 = new TestThread1();
        new Thread(testThread1).start();
        new Thread(testThread1).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "执行线程"+i);
        }

    }
}
