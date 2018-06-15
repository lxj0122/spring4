package com.spring.annotation;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 9:33
 */
public class JavaUserFunctionService {
    JavaFunctionService javaFunctionService;

    public void setJavaFunctionService(JavaFunctionService javaFunctionService) {
        this.javaFunctionService = javaFunctionService;
    }

    public String sayHello(String word){
        return javaFunctionService.sayHello(word);
    }
}
