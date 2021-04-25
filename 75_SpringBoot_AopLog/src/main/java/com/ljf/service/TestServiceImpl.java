package com.ljf.service;

import org.springframework.stereotype.Service;

/**
 * @author: ljf
 * @create: 2021/4/22 15:01
 * @description:
 **/
@Service
public class TestServiceImpl implements TestService{
    @Override
    public void testService(String str,String name) {
        String s = null;
        s.toString();
        System.out.println(str + name);

    }
}
