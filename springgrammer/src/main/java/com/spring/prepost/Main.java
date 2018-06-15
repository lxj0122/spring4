package com.spring.prepost;

import com.spring.config.PrePostConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 14:16
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService=annotationConfigApplicationContext.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService=annotationConfigApplicationContext.getBean(JSR250WayService.class);
        annotationConfigApplicationContext.close();
    }
}
