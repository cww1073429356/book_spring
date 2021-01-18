package com.cc.quartz;

import org.quartz.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: jinjinwen
 * @description: myquartz
 * @date: 2021-01-18 14:59
 **/
public class MyJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("MyJob.execute");
    }

    public static void main(String[] args) throws InterruptedException, SchedulerException {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        Scheduler scheduler =(Scheduler) applicationContext.getBean("scheduler");
        Thread.sleep(4000);
        scheduler.pauseJob(JobKey.jobKey("myjob","myjob_group"));
        Thread.sleep(4000);
        scheduler.resumeJob(JobKey.jobKey("myjob","myjob_group"));
//        scheduler.deleteJob(JobKey.jobKey("myjob","myjob_group"));
    }
}
