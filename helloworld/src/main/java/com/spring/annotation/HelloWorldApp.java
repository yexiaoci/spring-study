package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**@ComponentScan
 * 用于寻找用@ComponentScan注解标注的bean
 */

@ComponentScan
public class HelloWorldApp {
    public static void main(String[] args) {
        //1.通过注解创建上下文
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldApp.class);
        //2.读取bean
        HelloWorld hello = context.getBean(HelloWorld.class);
        //3.运行
        System.out.println(hello.getHello());

    }
}