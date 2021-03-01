package com.ljf;

import com.ljf.annotations.TestAnnotation;

import java.lang.annotation.Annotation;

/**
 * @author: ljf
 * @create: 2021-03-01 15:54
 * @description:
 *
 * 反射获取注解
 *
 **/

@TestAnnotation(name = "hello")
public class Test09 {

    @TestAnnotation(name = "name")
    private String name;


    public static void main(String[] args) {
        try {
            Class c1 = Class.forName("com.ljf.Test09");

            Annotation[] annotations = c1.getAnnotations();
            for (Annotation annotation : annotations) {
                TestAnnotation t = (TestAnnotation)annotation;
                System.out.println(t.name());

                System.out.println(annotation);
            }
            TestAnnotation annotation1 = (TestAnnotation) c1.getAnnotation(TestAnnotation.class);

            //TestAnnotation annotation = (TestAnnotation)
            System.out.println(annotation1.name());


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
