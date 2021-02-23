package com.ljf.demo1.dao;

/**
 * @author: ljf
 * @create: 2021-02-23 14:37
 * @description:
 **/
public class UserDaoByMysqlImpl implements UserDao {
    @Override
    public void getUserInfo() {
        System.out.println("mysql查询");
    }
}
