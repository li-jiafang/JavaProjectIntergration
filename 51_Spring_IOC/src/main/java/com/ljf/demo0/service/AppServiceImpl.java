package com.ljf.demo0.service;

import com.ljf.demo0.dao.AppDao;
import com.ljf.demo0.dao.AppDaoALiBabaImpl;
import com.ljf.demo0.dao.AppDaoWeChatImpl;


/**
 * @author: ljf
 * @create: 2021-04-15 10:54
 * @description:
 **/
public class AppServiceImpl implements AppService{
    // 方式一
    // private AppDao appDao = new AppDaoALiBabaImpl();

    // private AppDao appDao = new AppDaoWeChatImpl();

    //方式二
    private AppDao appDao;

    public AppServiceImpl(AppDao appDao) {
        this.appDao = appDao;
    }

    @Override
    public void select() {
        appDao.use();
    }

}
