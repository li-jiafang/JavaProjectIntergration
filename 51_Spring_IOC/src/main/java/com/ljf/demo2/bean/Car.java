package com.ljf.demo2.bean;

import lombok.Data;

/**
 * @author: ljf
 * @create: 2021-04-15 12:11
 * @description:
 **/
@Data
public class Car {

    private String name;

    private String length;

    private String width;

    private String height;

    private Wheel wheel;
}
