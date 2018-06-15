package com.spring.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/15
 * Time: 10:52
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService=annotationConfigApplicationContext.getBean(AsyncTaskService.class);
        for(int i=0;i<10;i++){
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAyncTaskPlus(i);
        }
        annotationConfigApplicationContext.close();
    }
}
