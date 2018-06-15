package com.spring.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 11:23
 */
@Service
public class DemoService {
    @Value("其它类的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
