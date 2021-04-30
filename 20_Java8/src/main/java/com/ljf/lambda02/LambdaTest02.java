package com.ljf.lambda02;

import cn.hutool.core.io.LineHandler;
import cn.hutool.core.lang.Filter;
import cn.hutool.core.lang.copier.Copier;
import cn.hutool.core.lang.func.Func1;
import cn.hutool.core.lang.func.VoidFunc0;
import cn.hutool.cron.task.Task;
import com.ljf.begin00.Apple;
import com.ljf.constant.Constant;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

    /**
     * @FunctionalInterface public interface Function<T, R> {
     * 函数式接口方法: R apply(T t); 根据T类型返回R类型
     * 实现方法 public <T,R> List<R> map(List<T> list, Function<T,R> function) {
     */

    @Test
    public void testFunction() {
        List<Apple> list = Constant.processList();
        System.out.println(list);
        List<Double> doubles = map(list, Apple::getPrice);
        System.out.println(doubles);

        List<Integer> map1 = map(list, apple -> apple.getName().length());
        System.out.println(map1);

        List<String> map2 = map(list, apple -> apple.getName().replace("富士山", "旧金山"));
        System.out.println(map2);

    }

    public <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            R apply = function.apply(t);
            result.add(apply);
        }
        return result;
    }

    /**
     * 相同的表达式根据返回类型可以选择不同的函数式接口
     * <p>
     * 类型推断  根据上下文(目标类型)推断是什么类型的变量
     */
    @Test
    public void targetType() {

        VoidFunc0 voidFunc0 = () -> System.out.println("hello");

        Task task = () -> System.out.println("hello");

        Runnable runnable = () -> System.out.println("hello");

        Executable executable = () -> System.out.println("hello");


        // 没有类型推断 (Apple a1, Apple a2)
        Comparator<Apple> appleComparator1 = (Apple a1, Apple a2) -> a1.getPrice().compareTo(a2.getPrice());

        // (a1,  a2) 根据上下文(目标类型)推断是什么类型的变量
        Comparator<Apple> appleComparator2 = (a1, a2) -> a1.getPrice().compareTo(a2.getPrice());

        //
        Comparator<Apple> appleComparator3 = Comparator.comparing(Apple::getPrice);
    }


    /**
     * 局部变量赋值限制
     */
    int s = 20; // 全局变量 ,实例变量

    public static int c = 30;

    @Test
    public void localVariable() {
        int a = 10; // 局部变量
        //Runnable runnable1 = () -> System.out.println(a); // a提示报错
        Runnable runnable2 = () -> System.out.println(s); // s不会提示报错
        Runnable runnable3 = () -> System.out.println(c); // c不会提示报错

        a = 20;
        s = 30;
        c = 40;
    }

    /**
     * Lambda及其等效方法引用的例子
     * (Apple a) -> a.getWeight() Apple::getWeight
     * () -> Thread.currentThread().dumpStack() Thread.currentThread()::dumpStack
     * (str, i) -> str.substring(i) String::substring
     * (String s) -> System.out.println(s) System.out::println
     * <p>
     * equivalentReference 等效引用
     */
    @Test
    public void equivalentReference() {

        Func1<Apple, Double> getPrice = Apple::getPrice;

        Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);
        // 等效引用
        Function<String, Integer> function = Integer::parseInt;


        List<String> str = Arrays.asList("a", "b", "A", "B");
        str.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        // 等效引用
        str.sort(String::compareToIgnoreCase);

    }


    /**
     * 函数式接口Supplier 定义一个对象
     * 执行方法 get获取指定对象
     * <p>
     * 构造函数引用
     */
    @Test
    public void constructorReference() {
        Supplier<Apple> supplier = () -> new Apple();
        Apple apple = supplier.get();
        System.out.println(apple);

        // 构造函数等效引用
        Supplier<Apple> supplier2 = Apple::new;
    }


    /**
     * 复合 Lambda 表达式的有用方法
     * 比较器复合  逆序  + 链式操作
     */
    @Test
    public void complexLambda() {
        List<Apple> list = Constant.processList();

        System.out.println(list);   //

        // .reversed()逆序
        // comparing(Apple::getPrice)按价格排序
        // .thenComparing(Apple::getName)按名字排序
        // 整体逻辑是:先按照价格排序,再按照名字排序,最后都逆序
        list.sort(Comparator.comparing(Apple::getPrice).thenComparing(Apple::getName).reversed());
        System.out.println(list);
    }


    /**
     * 复合 Lambda 表达式的有用方法
     * 谓词复合  谓词接口包括三个方法： negate、 and和or，让你可以重用已有的Predicate来创建更复杂的谓词。
     * notRedApple.negate().and().or();
     */
    @Test
    public void complexLambda2() {
        List<Apple> list = Constant.processList();
        Predicate<Apple> notRedApple = apple -> "红色".equals(apple.getColor());
        List<Apple> filter = filter(list, notRedApple.negate().and(apple -> "黄色".equals(apple.getColor())));
        System.out.println(filter);

    }


    /**
     * 复合 Lambda 表达式的有用方法
     * 函数复合   Function接口为此配了andThen和compose两个默认方法
     * function   andThen  compose
     */
    @Test
    public void complexLambda3() {
        Function<Integer, Integer> function1 = x -> x + 1;
        Function<Integer, Integer> function2 = x -> x * 2;
        Function<Integer, Integer> function3 = function1.andThen(function2);

        System.out.println(function3.apply(2)); // 6
        System.out.println(function3.apply(4)); // 10
        // 操作等同于 先给值加1再给结果乘与2  （2+1）*2 = 6


        Function<Integer, Integer> function4 = function1.compose(function2);
        System.out.println(function4.apply(2)); // 5
        System.out.println(function4.apply(4)); // 9


        // 等同于先获取compose(function2)的结果给function1作为参数 等同于  2*2+1







    }


}
