package com.spring.quickstart.anantation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 采用注解和Lombok开发的Phone类
 */
@Component
@Data
public class Phone {
    //通过@Value注解给简单类型赋值
    @Value("三星")
    private  String brand;

    @Value("4000.06")
    private double prize;
}
