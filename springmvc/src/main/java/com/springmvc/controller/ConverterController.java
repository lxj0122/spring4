package com.springmvc.controller;

import com.springmvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/27
 * Time: 14:09
 */
@Controller
public class ConverterController {
    @RequestMapping(value="/convert",produces = "application/x-test")
    @ResponseBody
    public DemoObj convert(@RequestBody DemoObj demoObj){
         return demoObj;
    }
}
