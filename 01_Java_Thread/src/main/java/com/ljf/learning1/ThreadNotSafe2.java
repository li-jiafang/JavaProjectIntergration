package com.ljf.learning1;

/**
 * @author: ljf
 * @create: 2021-03-31 18:19
 * @description:
 *
 * 线程不安全之取钱
 **/
public class ThreadNotSafe2 {

    int sum = 100;
    boolean flag = true;


    public static void main(String[] args) {

    }
}

class You1 implements Runnable{


    @Override
    public void run() {
        withdrawMoney();
    }

    private void withdrawMoney() {
    }
}


class girlFriend implements Runnable{

    @Override
    public void run() {

    }
}