package com.ljf.demo;


import cn.hutool.core.util.StrUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 常用配置文件:application.properties 和 application.yml
 * 启动项目时,优先读取 application.yml 文件,再读取 application.properties 文件
 * 一般情况: 只默认适用一种配置文件即可
 * 如果两种配置文件同时存在,保证项目在两种文件中配置项目的内容不同,
 * 否则application.properties后加载会把application.yml配置的内容覆盖
 *
 */

@SpringBootApplication
@RestController
public class ModifyApplication {

    public static void main(String[] args) {

        //SpringApplication application = new SpringApplication(ModifyApplication.class);

        //application.setBannerMode(Banner.Mode.OFF); 控制项目启动图案的显示和隐藏

        //application.run(args);

        SpringApplication.run(ModifyApplication.class, args);


    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Say Hello";
    }

    @GetMapping("/test")
    public String getStr(@RequestParam(required = false,name = "name")String name){
       if (StrUtil.isBlank(name)){
           name = "ljf2";
       }

       return StrUtil.format("hello {}",name);

    }


}






