package com.ljf.dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * @author: ljf
 * @create: 2021-03-10 17:29
 * @description:
 *
 *  中介类必须实现InvocationHandler接口
 **/
public class DynamicProxy2  implements InvocationHandler {

    // 目标代理类对象
    private Object target;

    public DynamicProxy2() {
    }

//    public DynamicProxy2(Object target) {
//        this.target = target;
//    }

    public void setTarget(Object target) {
        this.target = target;
    }


    /**
     * 生成代理类实例
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("方法处理之前"+method.getName()+System.currentTimeMillis());
        Object invoke = method.invoke(target, args);
        System.out.println("方法处理之后"+method.getName()+System.currentTimeMillis());
        return invoke;
    }
}
