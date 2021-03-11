package com.ljf.dynamic2;

/**
 * @author: ljf
 * @create: 2021-03-10 17:26
 * @description:
 **/
public class Vendor2 implements Sell2 {
    @Override
    public void ad() {
        System.out.println("Vendor  ad method");
    }

    @Override
    public void sell() {
        System.out.println("Vendor sell method");
    }
}
