package com.ljf.dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: ljf
 * @create: 2021-03-10 17:23
 * @description:
 *
 *
 * 动态代理:在程序运行时动态加载代理类
 *
 * 动态代理使用:
 *  在委托类和代理类之间,需要增加一个中介类,并实现InvocationHandler接口
 *
 **/
public class DynamicTest2 {

    public static void main(String[] args) {

        Sell2 vendor2 = new Vendor2();

        DynamicProxy2 dynamicProxy = new DynamicProxy2();

        dynamicProxy.setTarget(vendor2);

        Sell2 proxy = (Sell2) dynamicProxy.getProxy();

        proxy.sell();

        proxy.ad();





    }

}
