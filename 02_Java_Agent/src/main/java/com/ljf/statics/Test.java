package com.ljf.statics;

/**
 * @author: ljf
 * @create: 2021-03-10 16:26
 * @description:
 **/
public class Test {


    public static void main(String[] args) {


        Vendor vendor = new Vendor();

        BusinessAgent businessAgent = new BusinessAgent(vendor);

        businessAgent.add();
    }
}
