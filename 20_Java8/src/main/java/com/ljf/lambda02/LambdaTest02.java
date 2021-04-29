package com.ljf.lambda02;

import cn.hutool.core.lang.Filter;
import com.ljf.begin00.Apple;
import com.ljf.constant.Constant;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author: ljf
 * @create: 2021/4/29 16:51
 * @description:
 **/
public class LambdaTest02 {


    /**
     * comparator 排序
     * <p>
     * 函数式接口 Comparator
     * <p>
     * 实现方法 list.sort(**)
     */
    @Test
    public void testComparator() {
        List<Apple> list = Constant.processList();
        System.out.println("原始:" + list);
        //list.sort((a1,a2)->a1.getPrice().compareTo(a2.getPrice()));  // 实现1
        list.sort((a1, a2) -> a2.getPrice().compareTo(a1.getPrice()));  // 实现1

        //list.sort(Comparator.comparing(Apple::getPrice).reversed());   // 实现2

        //list.sort(Comparator.comparing(apple -> apple.getPrice().compareTo(apple.getPrice())));
        System.out.println("排序后:" + list);
    }


    /**
     * Runnable 线程
     * <p>
     * 函数式接口Runnable
     * 实现方法 new Thread(**)
     */
    @Test
    public void testRunnable() {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName() + "运行" + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName() + "运行" + i);
            }
        });
        thread1.setName("车子");
        thread2.setName("火车");
        thread2.start();
        thread1.start();
    }


    /**
     * java.util.function.Predicate<T>
     * 函数式接口 Predicate
     * <p>
     * 实现方法 filter()
     */
    @Test
    public void testPredicate() {
        List<Apple> list = Constant.processList();
        System.out.println(list);
        Predicate<Apple> appleFilter = (Apple apple) -> apple.getPrice() > 10L;
        List<Apple> filter = filter(list, appleFilter);
        System.out.println(filter);


    }

    public <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    /**
     * @FunctionalInterface public interface Consumer<T> {
     * 函数式接口抽象方法 :  void accept(T t);
     * <p>
     * 可以实现集合的遍历,并对集合内部元素执行操作,比如只打印Apple的某个属性
     * 执行方法 forEach(list,apple -> System.out.println(apple.getName()));
     */
    @Test
    public void testConsumer() {
        List<Apple> list = Constant.processList();
        System.out.println(list);

        forEach(list, apple -> System.out.println(apple.getName()));
    }

    public <T> void forEach(List<T> list, Consumer<T> consumer) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
