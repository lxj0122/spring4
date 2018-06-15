package com.spring.event;

import com.spring.config.EventConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 15:09
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher=annotationConfigApplicationContext.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        annotationConfigApplicationContext.close();
    }
}
