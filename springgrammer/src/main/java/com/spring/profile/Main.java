package com.spring.profile;

import com.spring.config.ProfileConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 14:27
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.getEnvironment().setActiveProfiles("prod");
        annotationConfigApplicationContext.register(ProfileConfig.class);
        annotationConfigApplicationContext.refresh();
        DemoBean demoBean=annotationConfigApplicationContext.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        annotationConfigApplicationContext.close();
    }
}
