package com.ljf.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: ljf
 * @create: 2021-04-15 10:06
 * @description:
 **/
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // 为目标对象生成代理对象
    public Object getProxy(){
        // 工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行前");
        method.invoke(target,objects);
        System.out.println("方法执行后");
        return null;
    }


}
