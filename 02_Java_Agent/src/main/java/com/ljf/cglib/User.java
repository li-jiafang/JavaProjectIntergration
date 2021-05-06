package com.ljf.cglib;

/**
 * @author: ljf
 * @create: 2021-04-15 10:05
 * @description:
 * cglib代理
 * CGLIB通过继承的方式进行代理，无论目标对象有没有实现接口都可以代理，但是无法处理final的情况。
 *
 * 不能声明为final类
 * 不能声明方法为final
 *
 * 注意：对于从Object中继承的方法，CGLIB代理也会进行代理，如hashCode()、equals()、toString()等，但是getClass()、wait()等方法不会，因为它是final方法，CGLIB无法代理。
 **/
public class User {

    public  void save(){
        System.out.println("保存数据");
    }
}
