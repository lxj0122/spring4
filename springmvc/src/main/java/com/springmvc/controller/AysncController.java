package com.springmvc.controller;

import com.springmvc.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/28
 * Time: 9:27
 */
@Controller
public class AysncController {

    @Autowired
    private PushService pushService;
    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String> deferredCall(){
        return pushService.getAsyncUpdate();
    }
}
