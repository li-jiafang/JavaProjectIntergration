package com.ljf.aoplog;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author: ljf
 * @create: 2021/4/22 15:06
 * @description:
 **/

@Aspect
@Component
@Slf4j
public class AopLog {

    /**
     * controller层切入点
     */
    @Pointcut("execution(public * com.ljf.controller.*Controller.*(..))")
    public void controllerLog() {
        System.out.println("controller层切入点");
    }


    /**
     * service层切入点
     */
    @Pointcut("execution(public * com.ljf.service.*ServiceImpl.*(..))")
    public void serviceLog() {
        System.out.println("service层切入点");
    }





    @Before("controllerLog()")
    public void doControllerBefore(JoinPoint joinPoint){
        System.out.println("joinPoint controllerLog");
    }


    @Before("serviceLog()")
    public void doServiceBefore(JoinPoint joinPoint){
        System.out.println("joinPoint serviceLog");
    }




}
