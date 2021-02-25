package com.ljf.config;

import com.ljf.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: ljf
 * @create: 2021-02-25 17:38
 * @description:
 **/
@Configuration
//@ComponentScan("com.ljf.bean")
public class MyConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}
