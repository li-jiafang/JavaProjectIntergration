package com.ljf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: ljf
 * @create: 2021-03-01 15:30
 * @description:
 *
 * 分析性能问题
 * 普通方法 4ms
 * 反射执行方法 1442ms
 * 关闭安全检查执行反射方法 733ms
 * 结论 频繁调用反射方式时需要关闭安全检查
 *
 **/
public class Test08 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test01();
        test02();
        test03();
    }


    public static void test01(){
        User user = new User();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("普通方式执行10亿次:"+(endTime-startTime)+"ms");

    }


    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();

        Class c1 = user.getClass();
        Method getName = c1.getMethod("getName", null);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("普通方式执行10亿次:"+(endTime-startTime)+"ms");

    }


    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();

        Class c1 = user.getClass();
        Method getName = c1.getMethod("getName", null);
        getName.setAccessible(true);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("普通方式执行10亿次:"+(endTime-startTime)+"ms");

    }
}
