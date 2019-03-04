package com.spring;

public class MessageServiceImpl implements  MessageService {
    private String name;
    private int age;

    public MessageServiceImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getMessage(){
      return "HelloWorld!"+ name+","+ age;
    }

}
