package com.ljf.learning2;

/**
 * @author: ljf
 * @create: 2021/5/6 16:38
 * @description:
 * synchronize  可重入锁 如果发现是同一个线程,可执行方法
 * 如果不是可重入锁,下面代码会出现死锁
 *
 **/
public class Thread07 {
    public synchronized void m1(){
        System.out.println(Thread.currentThread().getName()+"m1 start");
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"m1 end");
    }



    public static void main(String[] args) {
        new Thread077().m1();

    }
}

class Thread077 extends Thread07{

    @Override
    public synchronized void m1(){
        System.out.println("子方法1");
        super.m1();
        System.out.println("子方法2");
    }
}
