package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 10:44
 */
@Configuration
@ComponentScan("com.spring.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
