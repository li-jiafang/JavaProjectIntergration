package com.ljf.cglib;

/**
 * @author: ljf
 * @create: 2021-04-15 10:04
 * @description:
 **/
public class Test {


    public static void main(String[] args) {

        // 定义目标对象
        User user = new User();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(user);

        User proxy = (User) proxyFactory.getProxy();
        proxy.save();


    }
}
