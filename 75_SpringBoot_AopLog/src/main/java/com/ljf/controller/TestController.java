package com.ljf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ljf
 * @create: 2021/4/22 15:01
 * @description:
 **/

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/test1")
    @ResponseBody
    public String test(){
        System.out.println("test");
        return "test";
    }
}
