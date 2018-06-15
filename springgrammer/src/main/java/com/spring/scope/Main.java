package com.spring.scope;

import com.spring.config.ScopeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 11:12
 */
public class Main {
    public static void main(String args[]){
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService s1=annotationConfigApplicationContext.getBean(DemoSingletonService.class);
        DemoSingletonService s2=annotationConfigApplicationContext.getBean(DemoSingletonService.class);
        DemoPrototypeService p1=annotationConfigApplicationContext.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2=annotationConfigApplicationContext.getBean(DemoPrototypeService.class);

        System.out.println("ps1与s2是否相等："+s1.equals(s2));
        System.out.println("p1与p2是否相等："+p1.equals(p2));
    }
}
