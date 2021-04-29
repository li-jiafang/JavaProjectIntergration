package com.ljf.begin00;

/**
 * @author: ljf
 * @create: 2021-03-17 11:16
 * @description:
 **/
public class ColorFilterImpl implements Filter{
    @Override
    public boolean filter(Apple apple) {
        return "红色".equals(apple.getColor());
    }
}
