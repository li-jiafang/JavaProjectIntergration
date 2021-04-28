package com.ljf.quartz.test;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author: ljf
 * @create: 2021/4/28 18:36
 * @description:
 **/
public class StartOfDayJob extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {


        System.out.println(System.currentTimeMillis());
    }
}
