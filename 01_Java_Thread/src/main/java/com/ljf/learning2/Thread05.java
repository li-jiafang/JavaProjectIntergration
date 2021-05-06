package com.ljf.learning2;

/**
 * @author: ljf
 * @create: 2021/5/6 16:38
 * @description:
 * 同步方法和非同步方法是否可以同时调用  可以
 * 这会导致一个问题,如:
 * 写入数据加锁,读取数据不加锁,因为同步方法和非同步方法可以同时调用,会导致脏读,如下:
 * m1还未设置money,结果m2先执行,读取到错误数据:: Thread-1name小明获取余额0.0,正确应该是100
 *
 * 解决方式 都加上synchronize
 *
 *
 *
 **/
public class Thread05 {

    String name;
    Double money=0.0;


    public synchronized void m1(){
        this.name = "小明";
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.money= 100D;
    }


    public void m2(){
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"name"+name+"获取余额"+money);
    }


    public static void main(String[] args) {
        Thread05 thread = new Thread05();
        new Thread(thread::m1).start();
        new Thread(thread::m2).start();

    }
}
