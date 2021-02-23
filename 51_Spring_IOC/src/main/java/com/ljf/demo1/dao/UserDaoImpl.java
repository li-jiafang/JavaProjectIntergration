package com.ljf.demo1.dao;

/**
 * @author: ljf
 * @create: 2021-02-23 14:22
 * @description:
 **/
public class UserDaoImpl implements UserDao{
    @Override
    public void getUserInfo() {
        System.out.println("使用默认方式查询");
    }
}
