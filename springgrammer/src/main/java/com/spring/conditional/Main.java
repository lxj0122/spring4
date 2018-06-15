package com.spring.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/15
 * Time: 13:26
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService=annotationConfigApplicationContext.getBean(ListService.class);
        System.out.println(annotationConfigApplicationContext.getEnvironment().getProperty("os.name")+"系统下的列表命令为："+listService.showListCmd());
    }
}
