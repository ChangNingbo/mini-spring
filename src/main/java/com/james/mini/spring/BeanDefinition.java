package com.james.mini.spring;

import lombok.Data;

/**
 * @author James
 */
@Data
public class BeanDefinition {

    private String id;

    private String className;

    public BeanDefinition(String id,String className){
        this.id = id;
        this.className = className;
    }
}
