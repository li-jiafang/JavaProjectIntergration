package com.ljf.quartz.test;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

import static org.quartz.TriggerBuilder.newTrigger;

/**
 * @author: ljf
 * @create: 2021/4/28 18:35
 * @description:
 **/

@RestController
public class TestQuartz {

    @Resource
    private Scheduler scheduler;



    @RequestMapping("/test")
    public void test() throws SchedulerException {
        //

        //Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        JobDetail job = JobBuilder.newJob(StartOfDayJob.class)
                .withIdentity("task", "group")
                .build();



        // 判断当前任务是不是间隔执行的，间隔执行需要做特殊处理
        Trigger trigger = null;
//        Trigger trigger = TriggerBuilder.newTrigger()
//                .withIdentity("trigger1", "group1")
//                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(3)
//                        .repeatForever()).build();
//        trigger.getJobDataMap().put("t2", "tv2");
            SimpleScheduleBuilder builder = SimpleScheduleBuilder.simpleSchedule();
            builder.withIntervalInSeconds(5);
            builder.repeatForever();
            trigger =newTrigger()
                    .withIdentity("trigger_" , "group")
                    //.startAt(new Date())
                    //.startNow()
                    .withSchedule(builder)
                    .build();

        //







//        //创建一个scheduler
//        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
//        //scheduler.getContext().put("skey", "svalue");
//
//        //创建一个Trigger
//        Trigger trigger = TriggerBuilder.newTrigger()
//                .withIdentity("trigger1", "group1")
//                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(3)
//                        .repeatForever()).build();
//        trigger.getJobDataMap().put("t2", "tv2");
//
//        //创建一个job
//        JobDetail job = JobBuilder.newJob(StartOfDayJob.class)
//                .withIdentity("myjob", "mygroup").build();
//        job.getJobDataMap().put("j2", "jv2");
//
//        //注册trigger并启动scheduler
//        scheduler.scheduleJob(job,trigger);
//        scheduler.start();

        scheduler.scheduleJob(job,trigger);
        scheduler.start();

    }





}
