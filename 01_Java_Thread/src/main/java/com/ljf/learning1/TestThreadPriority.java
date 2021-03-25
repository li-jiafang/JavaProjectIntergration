package com.ljf.learning1;

/**
 * @author: ljf
 * @create: 2021-03-25 13:03
 * @description:
 *
 * 测试线程优先级
 **/
public class TestThreadPriority implements Runnable {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"线程优先级:"+Thread.currentThread().getPriority());

        TestThreadPriority testThreadPriority = new TestThreadPriority();

        Thread t1 = new Thread(testThreadPriority,"t1");
        Thread t2 = new Thread(testThreadPriority,"t2");
        Thread t3 = new Thread(testThreadPriority,"t3");
        Thread t4 = new Thread(testThreadPriority,"t4");
        Thread t5 = new Thread(testThreadPriority,"t5");
        Thread t6 = new Thread(testThreadPriority,"t6");
        t1.setPriority(3);
        t2.setPriority(5);
        t3.setPriority(3);
        t4.setPriority(8);
        t5.setPriority(9);
        t6.setPriority(10);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"启动");
    }
}
