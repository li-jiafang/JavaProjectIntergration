package com.ljf;

import static org.junit.Assert.assertTrue;


import com.ljf.demo1.dao.UserDao;
import com.ljf.demo1.dao.UserDaoByOracleImpl;
import com.ljf.demo1.service.UserServiceImpl;
import com.ljf.demo3.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    /**
     * IOC理论演示场景1
     */
    @Test
    public void testDemo1()
    {
        /**
         * 业务逻辑并未改变,但是我却想实现多中方式查询,这种情况就要侵入代码结构,由程序员修改代码实现多种方式查询
         */
        UserServiceImpl userService = new UserServiceImpl();
        // 将执行方式交个用户选择
        userService.setUserDao(new UserDaoByOracleImpl());
        userService.getUserInfo();

    }

    @Test
    public void testDemo3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test.xml");
        Hello hello = (Hello) applicationContext.getBean("hello");
        System.out.println(hello);
    }


    @Test
    public void testDemo33(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test.xml");
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
        userService.getUserInfo();
    }



}
