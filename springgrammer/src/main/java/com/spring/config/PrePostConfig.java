package com.spring.config;

import com.spring.prepost.BeanWayService;
import com.spring.prepost.JSR250WayService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 14:13
 */
@Configuration
@ComponentScan("com.spring.prepost")
public class PrePostConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
