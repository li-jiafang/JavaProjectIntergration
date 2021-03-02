package com.ljf.dao;

/**
 * @author: ljf
 * @create: 2021-03-02 16:48
 * @description:
 **/
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("UserDaoImpl add");
    }

    @Override
    public void delete() {
        System.out.println("UserDaoImpl delete");
    }

    @Override
    public void update() {
        System.out.println("UserDaoImpl update");
    }

    @Override
    public void query() {
        System.out.println("UserDaoImpl query");
    }
}
