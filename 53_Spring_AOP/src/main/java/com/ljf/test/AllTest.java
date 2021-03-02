package com.ljf.test;

import com.ljf.service.UserService;
import com.ljf.service.UserServiceImpl;
import org.junit.jupiter.api.Test;

/**
 * @author: ljf
 * @create: 2021-03-02 16:52
 * @description:
 **/
public class AllTest {


    @Test
    public void generalTest(){
        UserService userService = new UserServiceImpl();
        userService.add();
        // 这是对方法一种基本调用方式,如果调用开始


    }
}
