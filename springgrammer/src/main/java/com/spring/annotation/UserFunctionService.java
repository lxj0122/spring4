package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 9:16
 */
@Service
public class UserFunctionService {

    @Autowired
    private FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
