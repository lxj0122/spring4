package com.springmvc.controller;

import com.springmvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/27
 * Time: 9:45
 */
@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg, DemoObj demoObj){
           throw  new IllegalArgumentException("非常抱歉，参数有误/来自@ModelAttribute："+msg);
    }
}
