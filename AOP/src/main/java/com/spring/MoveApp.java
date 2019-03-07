package com.spring;

public class MoveApp {
    public static void main(String[] args) {
        Move t1=new Tank();
        Move t2=new Car();
        Move moveproxy1=new TankProxy(t1);
        Move moveproxy2=new TankProxy(t2);
        moveproxy1.move();
        moveproxy2.move();
    }
}
