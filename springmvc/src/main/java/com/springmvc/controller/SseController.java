package com.springmvc.controller;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/27
 * Time: 16:07
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * SSE Server Send Event  服务端发送事件
 */
@Controller
public class SseController {

    @RequestMapping(value = "/push",produces = "text/event-stream")
    @ResponseBody
    public String push(){
        Random r=new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data:testing 1,2,3"+r.nextInt()+"\n\n";
    }
}
