package com.spring.el;

import com.spring.config.ElConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 11:45
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig elConfig=annotationConfigApplicationContext.getBean(ElConfig.class);
        elConfig.outputResource();
        annotationConfigApplicationContext.close();

    }
}
