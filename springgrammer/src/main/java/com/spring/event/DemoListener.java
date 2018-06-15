package com.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 14:41
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg=demoEvent.getMsg();
        System.out.println("我（bean-demoListener）接收到了bean-demoPublisher发布的消息"+msg);
    }
}
