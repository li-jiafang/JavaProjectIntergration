package com.ljf.learning2;

/**
 * @author: ljf
 * @create: 2021/5/6 16:38
 * @description:
 * synchronize  可重入锁 如果发现是同一个线程,可执行方法
 * 如果不是可重入锁,下面代码会出现死锁
 *
 **/
public class Thread06 {
    public synchronized void m1(){

        System.out.println(Thread.currentThread().getName()+"m1 start");
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m2();
        System.out.println(Thread.currentThread().getName()+"m1 end");
    }


    public synchronized void m2(){

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"m2 ");
    }


    public static void main(String[] args) {
        Thread04 thread = new Thread04();
        new Thread(thread::m1).start();
        new Thread(thread::m2).start();

    }
}
