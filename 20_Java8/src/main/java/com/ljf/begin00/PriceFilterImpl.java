package com.ljf.begin00;

/**
 * @author: ljf
 * @create: 2021-03-17 11:20
 * @description:
 **/
public class PriceFilterImpl implements Filter{
    @Override
    public boolean filter(Apple apple) {
        return apple.getPrice()==10;
    }
}
