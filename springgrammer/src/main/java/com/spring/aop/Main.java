package com.spring.aop;

import com.spring.config.AopConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 10:49
 */
public class Main {

    public static void main(String args[]){
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AopConfig.class);
        DemoMethodService demoMethodService=annotationConfigApplicationContext.getBean(DemoMethodService.class);
        DemoAnnotationService demoAnnotationService=annotationConfigApplicationContext.getBean(DemoAnnotationService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        annotationConfigApplicationContext.close();
    }
}
