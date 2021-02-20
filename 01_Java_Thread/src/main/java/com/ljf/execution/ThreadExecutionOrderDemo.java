package com.ljf.execution;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Semaphore;

/**
 * @author: ljf
 * @create: 2021-02-20 17:00
 * @description: 1. 如何控制线程AB交替执行
 * 2. 如何控制线程A先执行B后执行
 * 3. 如何控制A执行有结果,依据结果A再执行B
 * 4. 如何保证线程安全
 * 5. 线程池有哪几种实现方式
 * 6. 线程池执行原理以及好处,有什么缺陷
 * 总共有多少种方式
 **/
public class ThreadExecutionOrderDemo {

    public int i0 = 0;   // 无法读取
    private static int i1 = 0; // 不报红

    public static void main(String[] args) {
        Thread t = new Thread();
        t.interrupt();

        // 理论上这里需要线程池，我这个是简单的demo
        // 注意jdk自带的5个线程池不能用，不能用的原因参考阿里开发手册，这个是高频面试题
        // 信号量 公平锁，每一次释放再次请求放到队列末尾，先进先出
        final Semaphore semaphore = new Semaphore(1, true);

        final int i2 = 0; // 不报红
        int i3 = 0; // 报红


        // 创建两个线程
       new Thread(new Runnable() {
            @Override
            public void run() {
                while (i1 < 10) {
                    try {
                        i1++;
                        System.out.println(i2 == 10);
                        i0 = 0;
                        i2 = 0;
                        i3 = 0;
                        i1 = 0;

                        // 获取锁，这个时候回去判断信号量里面 permits 许可是否为1 如果为0
                        // 说明另一个线程已经拿到锁，该线程加入队列，休眠
                        // 如果是1 执行当前线程，开发中我们使用redission， 参见胃肠外科项目
                        semaphore.acquire();
                        System.out.println("A线程");
                        Thread.sleep(1000);
                        // 释放锁, permits 置1 ，释放，唤醒队列中下一个线程
                        semaphore.release();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        // 创建两个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (i < 10) {
                    try {
                        // 获取锁
                        semaphore.acquire();
                        System.out.println("B线程");
                        Thread.sleep(1000);
                        // 释放锁
                        semaphore.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        ).start();
    }


    @Test
    public void test1() {

    }
}
