package com.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * 用户自定义的前置增强类
 */
public class MyBeforeAdvice {
    private static final Logger logger= LoggerFactory.getLogger(MyBeforeAdvice.class);
    //定义前置方法
    public void beforeMethod(){
        System.out.println("This is a before method");
        logger.info("this is a before method");
    }
}
