package com.ljf.learning1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ljf
 * @create: 2021-04-08 17:19
 * @description:
 * StringBuilder 线程不安全
 *
 *
 **/
public class ThreadNoSafe4 {


    public static void main(String[] args) throws InterruptedException {

        System.out.println("StringBuilder存储十万个元素");
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            int finalI = i;
            new Thread(()->{
                stringBuilder1.append("1");
            }).start();
        }

        Thread.sleep(100);

        System.out.println(stringBuilder1.length());

        StringBuilder stringBuilder2 = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            stringBuilder2.append("1");
        }
        System.out.println(stringBuilder2.length());


        System.out.println("stringBuffer存储十万个元素");
        StringBuffer stringBuffer1 = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            int finalI = i;
            new Thread(()->{
                stringBuffer1.append("1");
            }).start();
        }

        Thread.sleep(100);

        System.out.println(stringBuffer1.length());

        StringBuffer stringBuffer2 = new StringBuffer();

        for (int i = 0; i < 100000; i++) {
            stringBuffer2.append("1");
        }
        System.out.println(stringBuffer2.length());
    }
}
