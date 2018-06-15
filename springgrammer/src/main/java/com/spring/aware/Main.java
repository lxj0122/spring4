package com.spring.aware;

import com.spring.config.AwareConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/15
 * Time: 10:24
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService=annotationConfigApplicationContext.getBean(AwareService.class);
        awareService.outputResult();
        annotationConfigApplicationContext.close();
    }
}
