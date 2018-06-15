package com.spring.config;

import com.spring.profile.DemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/13
 * Time: 14:23
 */
@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from develoment profile");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean(){
        return new DemoBean("from production profile");
    }
}
