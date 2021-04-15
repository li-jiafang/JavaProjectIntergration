package com.ljf.demo1;

import java.lang.reflect.Proxy;

/**
 * @author: ljf
 * @create: 2021-04-15 13:03
 * @description:
 *
 * 生成代理类
 **/
public class GenerateProxy {

    public static Object getProxy(Object bean,Advice advice){
        return Proxy.newProxyInstance(GenerateProxy.class.getClassLoader(), bean.getClass().getInterfaces(), advice);
    }
}
