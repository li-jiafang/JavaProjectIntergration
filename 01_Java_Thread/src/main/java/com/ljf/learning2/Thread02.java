package com.ljf.learning2;

/**
 * @author: ljf
 * @create: 2021/5/6 16:38
 * @description:
 *  synchronized 关键字
 *
 *  对某个对象加锁
 **/
public class Thread02 {

    private int count = 10;

    private Object o = new Object();

    public void m(){
        synchronized (this){
            count--;
            System.out.println(Thread.currentThread().getName()+" count = " + count);
        }
    }


    public static void main(String[] args) {
        Thread02 thread01 = new Thread02();
        for (int i = 0; i < 10; i++) {
            new Thread(thread01::m).start();
        }

    }
}
