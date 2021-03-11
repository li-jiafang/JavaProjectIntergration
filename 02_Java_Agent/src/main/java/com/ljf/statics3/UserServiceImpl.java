package com.ljf.statics3;

/**
 * @author: ljf
 * @create: 2021-03-11 14:19
 * @description:
 **/
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("添加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("更新用户");
    }

    @Override
    public void query() {
        System.out.println("查询用户");
    }
}
