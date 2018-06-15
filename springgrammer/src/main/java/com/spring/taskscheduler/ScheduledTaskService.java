package com.spring.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/15
 * Time: 10:59
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次："+simpleDateFormat.format(new Date()));
    }
    @Scheduled(cron = "0 28 11 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间 "+simpleDateFormat.format(new Date())+" 执行");
    }
}
