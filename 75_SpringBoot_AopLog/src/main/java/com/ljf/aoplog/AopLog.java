package com.ljf.aoplog;

import cn.hutool.core.util.ArrayUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


/**
 * @author: ljf
 * @create: 2021/4/22 15:06
 * @description:
 **/

@Aspect
@Component
@Slf4j
public class AopLog {

    private static final String UNKNOWN = "unknown";

    /**
     * controller层切入点
     */
    @Pointcut("execution(public * com.ljf.controller.*Controller.*(..))")
    public void controllerLog() {
    }


    /**
     * service层切入点
     */
    @Pointcut("execution(public * com.ljf.service.*ServiceImpl.*(..))")
    public void serviceLog() {
    }


    /**
     * 前置通知,记录controller层获取用户录入信息
     * @param point
     */
    @Before("controllerLog()")
    public void doControllerBefore(JoinPoint point) {
        System.out.println("joinPoint controllerLog");
        // 开始打印请求日志
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = Objects.requireNonNull(attributes).getRequest();
        String ip = getIp(request); // 获取ip地址
        String url = request.getRequestURL().toString(); // 获取请求url
        String httpMethod = request.getMethod(); // 获取请求方法get  post  put delete

        String declaringTypeName = point.getSignature().getDeclaringTypeName();
        String name = point.getSignature().getName();
        String classMethod = String.format("%s.%s",declaringTypeName,name); // 获取类名和方法名
        Map<String, Object> nameAndValue = getNameAndValue(point); // 获取方法参数名和参数值

        String header = request.getHeader("User-Agent");


        System.out.println("");

    }


    @Before("serviceLog()")
    public void doServiceBefore(JoinPoint point) {
        System.out.println("joinPoint serviceLog");

        // 开始打印请求日志
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = Objects.requireNonNull(attributes).getRequest();
        String ip = getIp(request); // 获取ip地址
        String url = request.getRequestURL().toString(); // 获取请求url
        String httpMethod = request.getMethod(); // 获取请求方法get  post  put delete

        String declaringTypeName = point.getSignature().getDeclaringTypeName();
        String name = point.getSignature().getName();
        String classMethod = String.format("%s.%s",declaringTypeName,name); // 获取类名和方法名
        Map<String, Object> nameAndValue = getNameAndValue(point); // 获取方法参数名和参数值

        String header = request.getHeader("User-Agent");


        System.out.println("");
    }

    @AfterThrowing(pointcut = "controllerLog()",throwing = "e")
    public void doAfterThrowing(JoinPoint point,Throwable e){


        System.out.println("=====异常通知开始=====");
        System.out.println("异常代码:" + e.getClass().getName());
        System.out.println("异常信息:" + e.getMessage());
        System.out.println("异常方法:" + (point.getTarget().getClass().getName() + "." + point.getSignature().getName() + "()"));

    }







    /**
     *  获取方法参数名和参数值
     * @param joinPoint
     * @return
     */
    private Map<String, Object> getNameAndValue(JoinPoint joinPoint) {

        final Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        final String[] names = methodSignature.getParameterNames();
        final Object[] args = joinPoint.getArgs();

        if (ArrayUtil.isEmpty(names) || ArrayUtil.isEmpty(args)) {
            return Collections.emptyMap();
        }
        if (names.length != args.length) {
            log.warn("{}方法参数名和参数值数量不一致", methodSignature.getName());
            return Collections.emptyMap();
        }
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(names[i], args[i]);
        }
        return map;
    }


    /**
     * 获取ip地址
     */
    public static String getIp(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        String comma = ",";
        String localhost = "127.0.0.1";
        if (ip.contains(comma)) {
            ip = ip.split(",")[0];
        }
        if (localhost.equals(ip)) {
            // 获取本机真正的ip地址
            try {
                ip = InetAddress.getLocalHost().getHostAddress();
            } catch (UnknownHostException e) {
                log.error(e.getMessage(), e);
            }
        }
        return ip;
    }


    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class Log {
        // 线程id
        private String threadId;
        // 线程名称
        private String threadName;
        // ip
        private String ip;
        // url
        private String url;
        // http方法 GET POST PUT DELETE PATCH
        private String httpMethod;
        // 类方法
        private String classMethod;
        // 请求参数
        private Object requestParams;
        // 返回参数
        private Object result;
        // 接口耗时
        private Long timeCost;
        // 操作系统
        private String os;
        // 浏览器
        private String browser;
        // user-agent
        private String userAgent;
    }




}
