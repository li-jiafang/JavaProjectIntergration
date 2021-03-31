package com.ljf.learning1;

/**
 * @author: ljf
 * @create: 2021-03-31 17:57
 * @description:
 *
 * 线程不安全之买票
 *
 *  synchronized void buyTicket() 加上线程同步方法
 **/
public class ThreadNotSafe1 {

    public static void main(String[] args) {

        BuyATicket buyATicket = new BuyATicket();
        new Thread(buyATicket,"A").start();
        new Thread(buyATicket,"B").start();
        new Thread(buyATicket,"C").start();
    }



}


class BuyATicket implements Runnable{

    int ticketNum = 10;
    boolean flag = true;
    @Override
    public void run() {
        while (flag){
            buyTicket();
        }
    }

     synchronized void buyTicket(){
        if (ticketNum <= 0){
            flag = false;
            return;
        }else{
            System.out.println(Thread.currentThread().getName()+":"+ ticketNum--);
        }
         try {
             Thread.sleep(100);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

    }
}
