package com.springmvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/22
 * Time: 15:05
 */
public class WebInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext=new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register(MvcConfig.class);
        annotationConfigWebApplicationContext.setServletContext(servletContext);

        ServletRegistration.Dynamic dynamic=servletContext.addServlet("dispatcher",new DispatcherServlet(annotationConfigWebApplicationContext));
        dynamic.setLoadOnStartup(1);
        dynamic.addMapping("/");
    }
}
