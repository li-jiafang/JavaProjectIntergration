package com.ljf.transaction;

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
 * @create: 2021-03-31 14:15
 * @description:
 **/

@Aspect
@EnableTransactionManagement
@Configuration
public class TransactionConfig {

    /**
     * 只对service层配置事务
     */
    private static final String AOP_POINTCUT_EXPRESSION = "execution(* com.ljf.service..*.*(..))";

    @Resource
    private TransactionManager transactionManager;


    @Bean
    public TransactionInterceptor txAdvice(){

        RuleBasedTransactionAttribute attribute = new RuleBasedTransactionAttribute();
        attribute.setRollbackRules(Collections.singletonList(new RollbackRuleAttribute(Exception.class)));
        attribute.setTimeout(5000);
        attribute.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);


        NameMatchTransactionAttributeSource source = new NameMatchTransactionAttributeSource();
        Map<String, TransactionAttribute> map = new HashMap<>(30);
        map.put("*",attribute);
        source.setNameMap(map);
        return new TransactionInterceptor(transactionManager,source);
    }

    @Bean
    public Advisor txAdviceAdvisor(){
        /* 声明切点的面：切面就是通知和切入点的结合。通知和切入点共同定义了关于切面的全部内容——它的功能、在何时和何地完成其功能*/
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        /*声明和设置需要拦截的方法,用切点语言描写*/
        pointcut.setExpression(AOP_POINTCUT_EXPRESSION);
        /*设置切面=切点pointcut+通知TxAdvice*/
        return new DefaultPointcutAdvisor(pointcut, txAdvice());
    }
}
