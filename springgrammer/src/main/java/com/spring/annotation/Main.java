package com.spring.annotation;

import com.spring.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 9:21
 */
public class Main {

    public static void main(String args[]){
//        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(DiConfig.class);
//        UserFunctionService userFunctionService=annotationConfigApplicationContext.getBean(UserFunctionService.class);
//        System.out.println(userFunctionService.sayHello("di"));
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(JavaConfig.class);
        JavaUserFunctionService javaUserFunctionService=annotationConfigApplicationContext.getBean(JavaUserFunctionService.class);
        System.out.println(javaUserFunctionService.sayHello("java config"));

        annotationConfigApplicationContext.close();
    }
}
