package com.ljf;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: ljf
 * @create: 2021-03-01 14:35
 * @description:
 **/
public class Test07 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        Class c = Class.forName("com.ljf.User");
        System.out.println(c);

        // 通过反射来创建对象
//        User user = (User) c.newInstance();  // 本质上调用了类的无参构造器
//        System.out.println(user);

        // 通过newInstance创建对象 必须满足 包含无参构造器,无参构造器的访问权限必须是公共的,protected 必须保证在同一个包下

        // 问题:如果我们重载了有参构造,而没有无参构造,该如何创建对象呢

//        Constructor constructor = c.getDeclaredConstructor(String.class, int.class, String.class);
//
//        User user1 = (User) constructor.newInstance("hello", 12, "shit");
//        System.out.println(user1);



        // 通过反射调用普通方法
        // invoke操作方法,使用方式:第一个参数传递对象,第二个对象是调用方法的值
//        User user = (User) c.newInstance();
//        Method setName = c.getDeclaredMethod("setName", String.class);
//        setName.invoke(user,"ljf");
//        System.out.println(user.getName());



        User user = (User) c.newInstance();
        Field name = c.getDeclaredField("name");

        // 那如何通过反射来给私有属性赋值,
        name.setAccessible(true); // 这个主要关闭程序的安全检测,来实现对私有属性赋值
        // Method Filed Constructor都有setAccessible方法
        name.set(user,"ljf2");
        System.out.println(user.getName());
        // Class com.ljf.Test07 can not access a member of class com.ljf.User with modifiers "private"
        // 提示属性是私有的,无法直接赋值

    }
}
