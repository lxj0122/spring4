package com.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 14:46
 */
@Component
public class DemoPublisher {

    @Autowired
    private ApplicationContext applicationContext;
    public void  publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
