package com.ljf.learning2;

/**
 * @author: ljf
 * @create: 2021/5/6 16:38
 * @description:
 * 同步方法和非同步方法是否可以同时调用  可以
 * Thread-0m1 start
 * Thread-1m2
 * Thread-0m1 end
 **/
public class Thread04 {


    public synchronized void m1(){

        System.out.println(Thread.currentThread().getName()+"m1 start");
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"m1 end");
    }


    public void m2(){

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
