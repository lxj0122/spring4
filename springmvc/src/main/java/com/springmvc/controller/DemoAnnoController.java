package com.springmvc.controller;

import com.springmvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/22
 * Time: 15:33
 */
@Controller
@RequestMapping("/anno")
@ResponseBody
public class DemoAnnoController {

    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public String index(HttpServletRequest request){
        return "url:"+request.getRequestURL()+" can access";
    }

    @RequestMapping(value = "/pathvar/{str}",produces = "text/plain;charset=UTF-8")
    public String  demoPathVar(HttpServletRequest request, @PathVariable String str) throws UnsupportedEncodingException {
        //解决中文乱码
        String s=new String(str.getBytes("ISO-8859-1"),"UTF-8");
        return "url:"+request.getRequestURL()+"can access,str:"+s;
    }

    @RequestMapping(value = "/requestParam",produces = "text/plain;charset=UTF-8")
    public String requestParam(HttpServletRequest request,String param){
        return "url:"+request.getRequestURL()+",can access,param："+param;
    }

    @RequestMapping(value = "/obj",produces = "text/plain;charset=UTF-8")
    public String obj(HttpServletRequest request,DemoObj demoObj){
        return "url:"+request.getRequestURL()+",can access,id："+demoObj.getId()+",name:"+demoObj.getName();
    }


}
