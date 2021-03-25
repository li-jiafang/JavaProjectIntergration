package com.ljf.learning1;

/**
 * @author: ljf
 * @create: 2021-03-25 13:13
 * @description:
 **/
public class TestThreadDaemon{

    public static void main(String[] args) {

        You you = new You();
        God god = new God();

        Thread thread1 = new Thread(you);
        Thread thread2 = new Thread(god);
        thread2.setDaemon(true); // 设置守护线程

        thread1.start();
        thread2.start();

        for (int i = 0; i < 40000; i++) {
            System.out.println("主线程"+i);
        }

    }
}

class God implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("上帝守护着你");
        }
    }
}

class You implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 30000; i++) {
            System.out.println("活着第"+i+"天");
        }
    }
}
