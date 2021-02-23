package com.ljf.demo1.dao;

/**
 * @author: ljf
 * @create: 2021-02-23 14:38
 * @description:
 **/
public class UserDaoByOracleImpl implements UserDao{
    @Override
    public void getUserInfo() {
        System.out.println("Oracle查询");
    }
}
