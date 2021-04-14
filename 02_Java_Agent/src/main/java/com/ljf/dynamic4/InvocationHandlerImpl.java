package com.ljf.dynamic4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: ljf
 * @create: 2021-04-14 15:17
 * @description:
 **/
public class InvocationHandlerImpl implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法开始:"+method.getName());
        method.invoke(target,args);
        System.out.println("方法结束:"+method.getName());
        return null;
    }
}
