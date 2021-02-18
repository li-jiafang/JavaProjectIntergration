package com.ljf;

/**
 * @program: JavaProjectIntergration
 * @author: ljf
 * @create: 2021-02-18 16:09
 * @description:
 **/
public class ThreadTypeA extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("方法: ThreadTypeA" + i);
        }
    }
}
