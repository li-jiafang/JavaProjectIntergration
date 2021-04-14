package com.ljf.dynamic4;

/**
 * @author: ljf
 * @create: 2021-04-14 15:15
 * @description:
 **/
public class Test {


    public static void main(String[] args) {

        Behavior behavior = new PersonImpl();

        InvocationHandlerImpl invocationHandler = new InvocationHandlerImpl();
        invocationHandler.setTarget(behavior);

        Behavior proxy = (Behavior) invocationHandler.getProxy();

        proxy.say();


    }



}
