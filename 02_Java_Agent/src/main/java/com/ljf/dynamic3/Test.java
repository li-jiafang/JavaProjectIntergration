package com.ljf.dynamic3;

/**
 * @author: ljf
 * @create: 2021-03-11 15:14
 * @description:
 **/
public class Test {


    public static void main(String[] args) {

        // 传入真实的角色类
        UserService3  userService3 = new UserServiceImpl3();

        // 获取代理角色,还没有

        DynamicProxyInvocationHandler dynamicProxyInvocationHandler = new DynamicProxyInvocationHandler();
        // 通过调用程序处理角色(DynamicProxyInvocationHandler) 来处理我们要调用的接口对象

        dynamicProxyInvocationHandler.setTarget(userService3);

        UserService3 proxy = (UserService3) dynamicProxyInvocationHandler.getProxy();

        proxy.add();


    }
}
