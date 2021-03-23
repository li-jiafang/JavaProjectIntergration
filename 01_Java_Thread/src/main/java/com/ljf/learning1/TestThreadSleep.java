package com.ljf.learning1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: ljf
 * @create: 2021/3/23 23:05
 * @description:
 *
 * Thread Sleep 用于实现倒计时以及模拟网络延迟
 **/
public class TestThreadSleep {


    public static void main(String[] args) throws InterruptedException {
        // 模拟网络延迟
        System.out.println("模拟网络延迟");
        networkDelay();

        System.out.println("---------------");

        System.out.println("模拟倒计时");
        // 倒计时
        countDown();

    }

    private static void networkDelay() throws InterruptedException {
        Date date = new Date(System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {

            System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
            Thread.sleep(1000);
            date = new Date(System.currentTimeMillis());
        }

    }

    private static void countDown() throws InterruptedException {
        int count = 10;
        while (true){
            System.out.println(count--);
            if (count <= 0){
                break;
            }
            Thread.sleep(1000);

        }
    }

}
