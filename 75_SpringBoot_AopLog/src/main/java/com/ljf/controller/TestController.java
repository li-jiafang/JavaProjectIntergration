package com.ljf.controller;

import com.ljf.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: ljf
 * @create: 2021/4/22 15:01
 * @description:
 **/

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/test1")
    @ResponseBody
    public String test(String name){
        testService.testService(name);
        System.out.println(name);
        return "test";
    }
}
