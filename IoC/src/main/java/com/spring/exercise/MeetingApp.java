package com.spring.exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MeetingApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/exercise.xml");
        Meeting meeting=context.getBean(Meeting.class);
        System.out.println(meeting);
    }
}
