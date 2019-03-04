package com.spring.exercise;

public class Car {
    private String brand;
    private String colour;
    private String  parameter;

    public Car(String brand, String colour, String parameter) {
        this.brand = brand;
        this.colour = colour;
        this.parameter = parameter;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", parameter='" + parameter + '\'' +
                '}';
    }
}
