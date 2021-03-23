package com.ljf.learning1;

/**
 * @author: ljf
 * @create: 2021-03-18 18:37
 * @description: 学习:
 * 多线程实现买票,初步了解并发问题
 **/

public class TestThread2 {

    public static void main(String[] args) {
        Buy buy = new Buy();
        new Thread(buy, "小明").start();
        new Thread(buy, "小李").start();
        new Thread(buy, "黄牛党").start();
    }
}

class Buy implements Runnable {

    private int nums = 10;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "购买了第" + nums-- + "票");
            if (nums <= 0) {
                flag = false;
            }
        }
    }
}
