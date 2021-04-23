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
    public void testService(String name) {
        System.out.println(name);
    }
}
