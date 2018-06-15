package com.spring.prepost;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 13:48
 */
public class BeanWayService {

    public void init(){
        System.out.println("@Bean-init-method");
    }
    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }
    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }
}
