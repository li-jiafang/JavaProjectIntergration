package com.ljf.statics3;

/**
 * @author: ljf
 * @create: 2021-03-11 14:23
 * @description:
 **/
public class UserProxyServiceImpl implements UserService{

    private UserService userService;


    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {
        before();
        userService.delete();
        after();
    }

    @Override
    public void update() {

    }

    @Override
    public void query() {

    }
    public void before(){
        System.out.println("删除之前的操作");
    }

    public void after(){
        System.out.println("删除之后的操作");
    }

}
