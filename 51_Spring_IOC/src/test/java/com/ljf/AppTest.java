package com.ljf;

import static org.junit.Assert.assertTrue;


import com.ljf.demo1.dao.UserDao;
import com.ljf.demo1.dao.UserDaoByOracleImpl;
import com.ljf.demo1.service.UserServiceImpl;
import com.ljf.demo3.Hello;
import com.ljf.demo5.User;
import org.junit.Test;
import org.junit.platform.engine.support.descriptor.ClasspathResourceSource;
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

    /**
     * IOC创建对象的几种方式
     *
     * 使用无参构造器创建对象,默认
     *
     * 使用有参构造器创建对象,
     * 1.下标赋值
     * 2.类型创建(不推荐使用,如何参数包含多个String类型,如何确定是固定类型)
     * 3.直接通过参数名来创建对象(推荐使用)
     */
    @Test
    public void testDemo5(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

//        User user = (User) applicationContext.getBean("user");
//
//        System.out.println(user);

        User user2 = (User) applicationContext.getBean("userNew3");

        System.out.println(user2);

    }


    /**
     * bean的作用域
     *
     */
    @Test
    public void testDemo55(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        User user1 = (User) applicationContext.getBean("userNew3");
        User user2 = (User) applicationContext.getBean("userNew3");

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1 == user2);

    }






}
