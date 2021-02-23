package com.ljf.demo1.service;


import com.ljf.demo1.dao.UserDao;

/**
 * @author: ljf
 * @create: 2021-02-23 14:23
 * @description:
 *
 * 方式一 用户的需求改变了程序的原代码,当程序员
 **/
public class UserServiceImpl implements UserService{

    // 方式一 传统方式
    /**
     * 如果没有依赖注入,如何来实现对dao层的调用,需要我们主动创建对象
     * 这是传统方式做法,弊端:无法灵活切换不同的编码使用方式,代码
     */
    // private UserDao userDao = new UserDaoImpl(); // 通过默认方式查询
    // private UserDao userDao = new UserDaoByMysqlImpl(); // 通过MySQL查询
    // private UserDao userDao = new UserDaoByOracleImpl(); // 通过Oracle查询

    /**
     * 客户需求是不定的,总是需要不同的方式来实现不同的效果
     * 如果不能将选择交个客户,由程序员控制的话
     * 这个程序代码将不停的修改
     * 用户只控制业务层,dao层不需要他们接触
     */

//    @Override
//    public void getUserInfo() {
//        userDao.getUserInfo();
//    }


    /**
     * 此时可以选择set方式注入,让用户决定用什么方式执行
     */


    // 方式二 Set注入方式
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUserInfo() {
        userDao.getUserInfo();
    }


}
