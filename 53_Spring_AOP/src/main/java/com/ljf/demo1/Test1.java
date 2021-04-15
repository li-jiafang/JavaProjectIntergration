package com.ljf.demo1;

/**
 * @author: ljf
 * @create: 2021-04-15 13:06
 * @description:
 *
 *
 **/
public class Test1 {


    public static void main(String[] args) {

        MethodInvocation methodInvocation = ()-> System.out.println("前置通知");

        HelloService helloService = new HelloServiceImpl();
        BeforeAdvice beforeAdvice = new BeforeAdvice();
        beforeAdvice.setTarget(helloService);
        beforeAdvice.setMethodInvocation(methodInvocation);


        HelloService proxy = (HelloService) GenerateProxy.getProxy(helloService, beforeAdvice);
        proxy.sayHello();


    }

}
