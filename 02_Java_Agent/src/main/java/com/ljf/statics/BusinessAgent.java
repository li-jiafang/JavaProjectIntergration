package com.ljf.statics;

/**
 * @author: ljf
 * @create: 2021-03-10 16:10
 * @description:
 **/
public class BusinessAgent implements Sell{

    private Sell vendor;

    public BusinessAgent() {
    }

    public BusinessAgent(Vendor vendor){
        this.vendor = vendor;
    }

    @Override
    public void add() {
        System.out.println("我是代理类");
        vendor.add();
    }

    @Override
    public void sell() {
        vendor.sell();
    }
}
