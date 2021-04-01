package com.ljf.learning1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ljf
 * @create: 2021-04-01 12:51
 * @description:
 *
 * ArrayList是线程不安全的
 * 多个线程操作同一个资源
 * 在集合指定位置会造成元素覆盖,从而出现数据错误
 *
 * synchronized (list) 线程增加锁
 **/
public class ThreadNoSafe3 {


    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                synchronized (list){
                    list.add(Thread.currentThread().getName());
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(list.size());

    }
}
