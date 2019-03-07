package com.spring.aop;

import java.util.logging.Logger;

/**
 * 用户自定义的前置增强类
 */
public class MyBeforeAdvice {
    private static final Logger logger=loggerFactoy;
    //定义前置方法
    public void beforeMethod(){
        System.out.println("This is a before method");
        logger.info("this is a before method");
    }
}
