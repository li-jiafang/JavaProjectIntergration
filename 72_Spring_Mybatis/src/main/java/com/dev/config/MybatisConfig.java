package com.dev.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: ljf
 * @create: 2021-03-30 11:25
 * @description:
 **/
@Configuration
@MapperScan("com.dev.project.dao")
public class MybatisConfig {
}
