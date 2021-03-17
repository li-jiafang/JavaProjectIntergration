package com.ljf.begin;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: ljf
 * @create: 2021-03-17 10:46
 * @description:
 **/
@Data
@AllArgsConstructor
public class Apple {

    private int id;

    private String name;

    private String color;

    private Double price;
}
