package com.spring.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 9:14
 */
@Service
public class FunctionService {

    public String sayHello(String word){
        return "hello "+word+"！";
    }
}
