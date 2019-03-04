package com.spring.quickstart.anantation;
/**
 * 采用注解开发的bean
 */

import org.springframework.stereotype.Component;

/**
 * @component用于类级别注解，标注本类为一个可被Spring容器托管的bean
 */
@Component
public class HelloWorld {
    public String getHello(){
        return  "Hello World";
    }
}
