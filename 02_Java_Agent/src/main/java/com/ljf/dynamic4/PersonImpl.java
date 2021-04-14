package com.ljf.dynamic4;

/**
 * @author: ljf
 * @create: 2021-04-14 15:17
 * @description:
 **/
public class PersonImpl implements Behavior{
    @Override
    public void say() {
        System.out.println("人说话");
    }

    @Override
    public void eat() {
        System.out.println("人吃饭");
    }
}
