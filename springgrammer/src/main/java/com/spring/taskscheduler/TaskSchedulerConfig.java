package com.spring.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/15
 * Time: 11:05
 */
@Configuration
@ComponentScan("com.spring.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
