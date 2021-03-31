package com.dev.config;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.interceptor.*;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: ljf
 * @create: 2021-03-31 10:37
 * @description:
 *
 * 全局事务配置
 **/
@Aspect
@EnableTransactionManagement
@Configuration
public class TransactionConfig {


    /**
     * 只对service层配置事务
     */
    private static final String AOP_POINTCUT_EXPRESSION = "execution(* com.dev.project.service..*.*(..))";

    @Resource
    private TransactionManager transactionManager;


    @Bean
    public TransactionInterceptor txAdvice(){
        // 事务声明规则,声明事务管理方法
        NameMatchTransactionAttributeSource source = new NameMatchTransactionAttributeSource();

        /*设置事务回滚机制*/
        RuleBasedTransactionAttribute attribute = new RuleBasedTransactionAttribute();
        /*抛出异常后执行切点回滚,这边你可以更换异常的类型*/
        attribute.setRollbackRules(Collections.singletonList(new RollbackRuleAttribute(Exception.class)));
        /*PROPAGATION_REQUIRED:事务隔离性为1，若当前存在事务，则加入该事务；如果当前没有事务，则创建一个新的事务。这是默认值*/
        attribute.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        /*设置事务失效时间，如果超过5秒，则回滚事务*/
        attribute.setTimeout(5000);

        // 设置指定方法执行事务,*代表所有
        Map<String, TransactionAttribute> map = new HashMap<>(30);
        map.put("*",attribute);
        source.setNameMap(map);

        return new TransactionInterceptor(transactionManager,source);
    }

    /**
     * 设置切面=切点pointcut+通知TxAdvice
     */
    @Bean
    public Advisor txAdviceAdvisor() {
        /* 声明切点的面：切面就是通知和切入点的结合。通知和切入点共同定义了关于切面的全部内容——它的功能、在何时和何地完成其功能*/
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        /*声明和设置需要拦截的方法,用切点语言描写*/
        pointcut.setExpression(AOP_POINTCUT_EXPRESSION);
        /*设置切面=切点pointcut+通知TxAdvice*/
        return new DefaultPointcutAdvisor(pointcut, txAdvice());
    }

}
