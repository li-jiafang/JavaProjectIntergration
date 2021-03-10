package com.ljf.statics;

/**
 * @author: ljf
 * @create: 2021-03-10 16:08
 * @description:
 **/
public class Vendor implements Sell{
    @Override
    public void add() {
        System.out.println("商家生产商品");
    }

    @Override
    public void sell() {
        System.out.println("商家销售商品");
    }
}
