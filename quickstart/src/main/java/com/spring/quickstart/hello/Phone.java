package com.spring.quickstart.hello;

public class Phone {
    private String brand;
    private double prize;
    public Phone(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public Phone(String brand, double prize) {
        this.brand = brand;
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", prize=" + prize +
                '}';
    }
}
