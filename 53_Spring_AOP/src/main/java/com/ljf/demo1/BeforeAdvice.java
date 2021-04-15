package com.ljf.demo1;

import javafx.beans.Observable;

import java.lang.reflect.Method;

/**
 * @author: ljf
 * @create: 2021-04-15 13:00
 * @description:
 **/
public class BeforeAdvice implements Advice{

    private Object target;

    private MethodInvocation methodInvocation;

    public void setTarget(Object target) {
        this.target = target;
    }

    public void setMethodInvocation(MethodInvocation methodInvocation) {
        this.methodInvocation = methodInvocation;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       methodInvocation.invoke();
       return method.invoke(target,args);
    }
}
