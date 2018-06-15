package com.spring.config;


import com.spring.annotation.JavaFunctionService;
import com.spring.annotation.JavaUserFunctionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 9:35
 */
@Configuration
public class JavaConfig {

    @Bean
    public JavaFunctionService javaFunctionService(){
        return new JavaFunctionService();
    }

    @Bean
    public JavaUserFunctionService javaUserFunctionService(){
        JavaUserFunctionService javaUserFunctionService=new JavaUserFunctionService();
        javaUserFunctionService.setJavaFunctionService(javaFunctionService());
        return javaUserFunctionService;
    }
   /* @Bean
    public JavaUserFunctionService javaUserFunctionService(JavaFunctionService javaFunctionService){
        JavaUserFunctionService javaUserFunctionService=new JavaUserFunctionService();
        javaUserFunctionService.setJavaFunctionService(javaFunctionService);
        return javaUserFunctionService;
    }*/
}
