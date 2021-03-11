package com.ljf.statics2;

/**
 * @author: ljf
 * @create: 2021-03-11 14:10
 * @description:
 **/
public class Test {


    public static void main(String[] args) {


        // 未使用代理完成用户去打车
        /*Driver driver = new Driver();
        driver.driveACar();*/

        //使用代理类来获取打车
        Driver driver = new Driver();
        DiDiProxy diDiProxy = new DiDiProxy();
        diDiProxy.setDriver(driver);

        diDiProxy.driveACar();



    }
}
