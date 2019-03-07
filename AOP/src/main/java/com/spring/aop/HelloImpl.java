package com.spring.aop;

public class HelloImpl implements Hello {
    @Override
    public String getHello() {
        return "hello,Spring AOP";
    }
}
