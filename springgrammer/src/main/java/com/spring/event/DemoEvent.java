package com.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 14:37
 */
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID=1;
    private String msg;
    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
