package com.ljf.statics3;

/**
 * @author: ljf
 * @create: 2021-03-11 14:20
 * @description:
 **/
public class Test {


    public static void main(String[] args) {
        // 按照常理,实现一个用户删除

        //UserService userService = new UserServiceImpl();
        //userService.delete();

        // 但如果在基础逻辑不变的情况下,增加其他逻辑,这时候我们需要依靠代理实现

        UserService userService = new UserServiceImpl();

        UserProxyServiceImpl userProxyService = new UserProxyServiceImpl();
        userProxyService.setUserService(userService);
        userProxyService.delete();



    }
}
