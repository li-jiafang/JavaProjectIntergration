package com.ljf.demo0;

import com.ljf.demo0.dao.AppDaoALiBabaImpl;
import com.ljf.demo0.dao.AppDaoWeChatImpl;
import com.ljf.demo0.service.AppService;
import com.ljf.demo0.service.AppServiceImpl;

/**
 * @author: ljf
 * @create: 2021-04-15 10:51
 * @description:
 * 传统实现,没有加入IOC思想
 * 由程序主动控制逻辑实现
 *
 **/
public class Test0 {

    public static void main(String[] args) {
        // 我要使用阿里巴巴
//         AppService appService = new AppServiceImpl();
//         appService.select();


        // 但是如果我要使用微信,我就要进入代码内部修改让程序使用service
        // private AppDao appDao = new AppDaoWeChatImpl(); 调用这个实现
//        AppService appService = new AppServiceImpl();
//        appService.select();

        // 很显然,逻辑是不合理的,核心业务逻辑不停的修改,如果简单还好,如果实现业务量大,会导致大量的代码量修改
        // 所以提出IOC理论,控制反转,DI(依赖注入)是它的实现方式


        // 使用微信
        AppService appService = new AppServiceImpl(new AppDaoWeChatImpl());
        appService.select();

        // 使用阿里巴巴
        AppService appService1 = new AppServiceImpl(new AppDaoALiBabaImpl());
        appService1.select();

        // 通过注入不同的对象,完成不同的方法,核心逻辑并未改变

    }


}
