package com.springmvc.domain;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/22
 * Time: 15:29
 */
public class DemoObj {

    private Long id;
    private String name;
    public DemoObj(){
        super();
    }
    public DemoObj(Long id,String name){
        super();
        this.id=id;
        this.name=name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
