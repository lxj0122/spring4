package com.spring.aop;

import java.lang.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 9:54
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
