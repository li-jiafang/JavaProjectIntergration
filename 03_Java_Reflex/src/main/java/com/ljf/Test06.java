package com.ljf;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author: ljf
 * @create: 2021-03-01 10:45
 * @description:
 **/
public class Test06 {

    public static void main(String[] args) {

        try {
            Class c1 = Class.forName("com.ljf.User");
            // 获取类
            System.out.println(c1.getName()); // 获得包名_类名
            System.out.println(c1.getSimpleName()); // 获得类名

            // 获取类的公共属性
            Field[] fields = c1.getFields(); // 默认获取类的所有公共属性,包括继承的父类所有公共(public)属性
            for (Field field : fields) {
                System.out.println(field);
            }

            // 获取类的所有属性
            fields = c1.getDeclaredFields(); // 获取指定类的所有属性,但不能获取父类的所有属性(一句话,只能获取当前类的所有属性)
            for (Field field : fields) {
                System.out.println("#" + field);
            }

            // 获取类的指定属性的值
            //Field name = c1.getField("name");
            //System.out.println(name); // 抛出异常java.lang.NoSuchFieldException: name
            // 为什么抛出异常
            // 因为getField只能获取一个类的公共属性,name属于私有属性,无法获取,所以报错
            // 应该用getDeclared,获取所有属性来获取


            Field name = c1.getDeclaredField("name");
            System.out.println("指定属性:" + name); // 抛出异常java.lang.NoSuchFieldException: name

            // 获取指定类的方法
            System.out.println("====================");
            Method[] methods = c1.getMethods(); // 获取指定类的公共方法,包括继承父类的方法
            for (Method method : methods) {
                System.out.println(method);
            }

            methods = c1.getDeclaredMethods(); // 获取指定类的所有方法,不包括父类的方法
            for (Method method : methods) {
                System.out.println("#" + method);
            }


            Class[] declaredClasses = c1.getDeclaredClasses();
            System.out.println(declaredClasses);


        } catch (ClassNotFoundException | NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
