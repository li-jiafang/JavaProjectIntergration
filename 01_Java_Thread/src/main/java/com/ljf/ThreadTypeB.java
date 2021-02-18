package com.ljf;

/**
 * @program: JavaProjectIntergration
 * @author: ljf
 * @create: 2021-02-18 16:21
 * @description:
 **/
public class ThreadTypeB implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("子线程 ThreadTypeB : " + i);
        }
    }
}
