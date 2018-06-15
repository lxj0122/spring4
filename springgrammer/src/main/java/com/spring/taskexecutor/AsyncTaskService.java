package com.spring.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/15
 * Time: 10:47
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务："+i);
    }
    @Async
    public void executeAyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1："+(i+1));
    }
}
