package com.spring.quickstart.anantation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Student {
    @Value("Lily")
    private String name;
    @Value("20")
    private int age;
    //引用类型，通过@Autowired注入Phone的bean
    @Autowired
    private Phone phone;
}
