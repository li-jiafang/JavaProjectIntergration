package com.ljf.learning1;

/**
 * @author: ljf
 * @create: 2021-03-25 12:28
 * @description:
 **/
public class TestThreadState {


    public static void main(String[] args) {

        Thread thread = new Thread(() ->
        {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("--------------");
        });

        Thread.State state = thread.getState();
        System.out.println("1:"+state);

        thread.start();
        state = thread.getState();
        System.out.println("2:"+state);

        while (thread.getState() != Thread.State.TERMINATED){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("3--"+thread.getState());
        }
        System.out.println("4"+thread.getState());


    }


}
