package com.ljf.dynamic;

/**
 * @author: ljf
 * @create: 2021-02-18 18:17
 * @description:
 **/
public class TestInterfaceImpl implements TestInterface{
    @Override
    public void add() {
        System.out.println("方法执行");
    }

    @Override
    public void delete() {
        System.out.println("方法执行");

    }
}
