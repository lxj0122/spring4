package com.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 11:10
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
