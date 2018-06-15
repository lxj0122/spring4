package com.spring.combineannotion;

import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/15
 * Time: 15:39
 */
@Service
public class DemoService {

    public void outputResult(){
        System.out.println("从组合注解配置照样获得bean");
    }
}
