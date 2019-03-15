package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TigerApp {
    public static  void main(String[]args){
        @SuppressWarnings("resources")
        ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
        Tiger tiger=context.getBean(Tiger.class);
        tiger.walk();
    }
}
