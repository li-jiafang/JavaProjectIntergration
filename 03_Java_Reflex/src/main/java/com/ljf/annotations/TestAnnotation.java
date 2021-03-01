package com.ljf.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: ljf
 * @create: 2021-03-01 15:55
 * @description:
 *
 * 一个注解包含三个元注解
 *
 **/
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
    String name() default "";
}
