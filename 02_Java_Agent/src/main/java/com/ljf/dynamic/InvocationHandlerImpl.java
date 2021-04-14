package com.ljf.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: ljf
 * @create: 2021-02-18 18:17
 * @description:
 **/
public class InvocationHandlerImpl implements InvocationHandler {

    private Object target;// 这其实业务实现类对象，用来调用具体的业务方法

    // 通过构造函数传入目标对象
    public InvocationHandlerImpl(Object target){
        this.target = target;
    }

    public static void main(String[] args) {
        TestInterface testInterface1 = new TestInterfaceImpl();
        testInterface1 = (TestInterface)generateProxy(testInterface1);

        testInterface1.delete();
    }

    private static Object generateProxy(TestInterface testInterface1) {
        InvocationHandlerImpl invocationHandler1 = new InvocationHandlerImpl(testInterface1);
        Object o = Proxy.newProxyInstance(InvocationHandlerImpl.class.getClass().getClassLoader()
                , testInterface1.getClass().getInterfaces(), invocationHandler1);
        return o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("调用开始处理");
        method.invoke(target, args);
        System.out.println("调用结束处理");
        return result;
    }
}
