package com.james.mini.spring;

import java.util.*;

public class ClassPathXmlApplicationContext {

    private List<BeanDefinition> beanDefinitions = new ArrayList<>();

    private Map<String,Object> singletons = new HashMap<>();

    // 构造器获取外部xml配置
    public ClassPathXmlApplicationContext(String fileName) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        this.readXml(fileName);
        this.instanceBeans();
    }

    // 利用反射创建bean实例
    private void instanceBeans() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        for (BeanDefinition beanDefinition : beanDefinitions) {
           singletons.put(beanDefinition.getId(),Class.forName(beanDefinition.getClassName()).newInstance());
        }
    }

    private void readXml(String fileName) {
        
    }

    public Object getBeans(String beanName){
       return singletons.get(beanName);
    }
}
