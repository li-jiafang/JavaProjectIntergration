package com.ljf.service;

import com.ljf.dao.UserDao;
import com.ljf.dao.UserDaoImpl;

/**
 * @author: ljf
 * @create: 2021-03-02 16:50
 * @description:
 **/
public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDaoImpl();

    @Override
    public void add() {
        userDao.add();
    }

    @Override
    public void delete() {
       userDao.delete();
    }

    @Override
    public void update() {
        userDao.update();
    }

    @Override
    public void query() {
        userDao.query();
    }
}
