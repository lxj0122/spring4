package com.spring.combineannotion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/15
 * Time: 15:42
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService=annotationConfigApplicationContext.getBean(DemoService.class);
        demoService.outputResult();
        annotationConfigApplicationContext.close();
    }
}
