package demo1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: ljf
 * @create: 2021-04-15 13:49
 * @description:
 **/
public class ArrayListTest1 {


    @Test
    public void test1() {
        List<String> list = new ArrayList<>();
        list.add("hello");

        list.add(2, "hhh"); // 提示数组越界
        System.out.println(list);
    }

    @Test
    void test2() {

        List<String> list = new ArrayList<>();
        list.add("hello");

        list.add(1, "hh");

        System.out.println(list);

    }


    /**
     * 代码执行结果没问题
     * 但是for循环打印temp却只打印了元素1,没有遍历循环打印出结果2,这是为什么呢
     *
     * 如果我们需要在for循环中获取元素2的值进行操作,那么代码就存在缺陷
     *
     * 原因: java 中foreach遍历是语法糖,它是在转换为字节码的情况下用迭代器Iterator的方式来遍历
     * test3 删除操作等同于 test4
     *
     * 阿里巴巴 开发规约提出
     * 不要在 foreach 循环里进行元素的 remove/add 操作。remove 元素请使用 Iterator 方式，如果并发操作，需要对 Iterator 对象加锁。
     * java.util.ConcurrentModificationException
     */
    @Test
    void test3() {
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        //a.add("3"); //增加元素3 提示 java.util.ConcurrentModificationException
        for (String temp : a) {
            System.out.println(temp);
            if ("1".equals(temp)) {
                a.remove(temp);
            }
        }
        System.out.println(a);
    }

    @Test
    void test4() {
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        //a.add("3"); //增加元素3 提示 java.util.ConcurrentModificationException
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()){

            String next = iterator.next();
            System.out.println(next);
            if ("1".equals(next)) {
                a.remove(next);
            }

        }
        System.out.println(a);
    }


    /**
     * 正确删除操作是 使用迭代器提供的remove删除方式
     *
     */
    @Test
    void test5() {
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        a.add("3");
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()){

            String next = iterator.next();
            System.out.println(next);
            if ("1".equals(next)) {
                iterator.remove();
            }
        }
        System.out.println(a);
    }
}
