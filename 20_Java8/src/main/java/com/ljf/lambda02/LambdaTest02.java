package com.ljf.lambda02;

import com.ljf.begin00.Apple;
import com.ljf.constant.Constant;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

/**
 * @author: ljf
 * @create: 2021/4/29 16:51
 * @description:
 **/
public class LambdaTest02 {


    /**
     * comparator 排序
     */
    @Test
    public void testComparator(){
        List<Apple> list = Constant.processList();
        System.out.println("原始:"+list);
        //list.sort((a1,a2)->a1.getPrice().compareTo(a2.getPrice()));  // 实现1
        list.sort((a1,a2)->a2.getPrice().compareTo(a1.getPrice()));  // 实现1

        //list.sort(Comparator.comparing(Apple::getPrice).reversed());   // 实现2

        //list.sort(Comparator.comparing(apple -> apple.getPrice().compareTo(apple.getPrice())));
        System.out.println("排序后:"+list);
    }



    /**
     * Runnable 线程
     */
    @Test
    public void testRunnable(){

        Thread thread1 = new Thread(()-> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName()+"运行"+i);
            }
        });

        Thread thread2 = new Thread(()-> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName()+"运行"+i);
            }
        });
        thread1.setName("车子");
        thread2.setName("火车");
        thread2.start();
        thread1.start();

    }



}
