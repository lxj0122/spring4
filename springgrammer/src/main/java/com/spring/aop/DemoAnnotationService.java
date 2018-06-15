package com.spring.aop;

import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 9:57
 */
@Service
public class DemoAnnotationService {

    @Action(name="注解式拦截的add操作")
    public void add(){

    }
}
