package com.ljf.cglib;

/**
 * @author: ljf
 * @create: 2021-04-15 10:05
 * @description:
 * cglib代理
 * 不能声明为final类
 * 可以声明方法为final
 **/
public class User {

    public final void save(){
        System.out.println("保存数据");
    }
}
