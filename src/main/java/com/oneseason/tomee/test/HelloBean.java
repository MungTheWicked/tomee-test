package com.oneseason.tomee.test;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    
    @PostConstruct
    public void initialize() {
        System.out.println("Hello, McFly?!?!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}