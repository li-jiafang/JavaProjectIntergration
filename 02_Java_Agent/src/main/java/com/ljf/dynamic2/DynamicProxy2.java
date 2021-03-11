package com.ljf.dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: ljf
 * @create: 2021-03-10 17:29
 * @description:
 *
 *  中介类必须实现InvocationHandler接口
 **/
public class DynamicProxy2  implements InvocationHandler {

    // obj对象为委托类对象(需要被代理对象)
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    // 生成代理类
    public Object getProxy(){

        return Proxy.newProxyInstance(DynamicProxy2.class.getClassLoader(),obj.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行之前");
        Object invoke = method.invoke(proxy, args);
        System.out.println("代理方法执行之后");
        return invoke;
    }
}
