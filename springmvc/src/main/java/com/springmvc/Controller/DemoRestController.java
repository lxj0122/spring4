package com.springmvc.Controller;

import com.springmvc.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/22
 * Time: 16:02
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getjson",produces = "application/json;charset=UTF-8")
    public DemoObj getjson(DemoObj demoObj){
        return new DemoObj(demoObj.getId(),demoObj.getName());
    }

    @RequestMapping(value = "/getxml",produces = "application/xml;charset=UTF-8")
    public DemoObj getxml(DemoObj demoObj){
        return new DemoObj(demoObj.getId(),demoObj.getName());
    }
}
