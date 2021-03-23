package com.ljf.learning1;

/**
 * @author: ljf
 * @create: 2021/3/23 22:50
 * @description:
 *
 * 线程停止方式建议手动停止,通过标记位让线程自动停下
 * 不建议使用stop方法和destroy()过时方法
 *
 *线程周期:  新建线程进入就绪状态  运行  死亡状态
 *                            运行过程出现阻塞状态 再次进入就绪状态 然后再运行
 **/
public class ThreadState implements Runnable {
    private boolean flag = true;

    @Override
    public void run() {
        while (flag){
            System.out.println(Thread.currentThread().getName()+"运行.....");
        }
    }


    public static void main(String[] args) {
        ThreadState threadState = new ThreadState();
        new Thread(threadState,"线程").start();

        for (int i = 0; i < 1000; i++) {
            if (i == 888){
                threadState.stop();
            }
            System.out.println("主线程"+i);
        }
    }

    // 设置一个方法让线程停止
    public void stop(){
        this.flag = false;
    }


}
