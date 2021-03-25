package com.ljf.learning1;

/**
 * @author: ljf
 * @create: 2021-03-25 12:20
 * @description:
 **/
public class TestThreadJoin implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            System.out.println("线程VIP来了"+i);
        }

    }


    public static void main(String[] args) throws InterruptedException {

        TestThreadJoin threadJoin = new TestThreadJoin();
        Thread thread = new Thread(threadJoin);
        thread.start();

        for (int i = 0; i < 1000; i++) {
            if (i == 200){
                thread.join(); // 子线程强制插队,只有子线程执行完了,才执行主线程
            }
            System.out.println("主线程在执行来了"+i);
        }
    }
}
