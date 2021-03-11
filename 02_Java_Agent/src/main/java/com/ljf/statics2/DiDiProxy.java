package com.ljf.statics2;

/**
 * @author: ljf
 * @create: 2021-03-11 14:11
 * @description:
 **/
public class DiDiProxy implements Car{

    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void driveACar() {
        getOrderForm();
        driver.driveACar();
        getFare();
    }


    public void getOrderForm(){
        System.out.println("滴滴平台获取订单");
    }

    public void getFare(){
        System.out.println("滴滴平台获取车费");
    }
}
