package com.ljf.dynamic3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: ljf
 * @create: 2021-03-11 15:09
 * @description:
 **/
public class DynamicProxyInvocationHandler implements InvocationHandler {


    // 被代理的角色
    private Object target;

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 生成代理类实例
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }

    // 处理代理类实例,并获取结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("方法名:"+method.getName());
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}
