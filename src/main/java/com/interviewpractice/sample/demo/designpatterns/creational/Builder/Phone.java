package com.interviewpractice.sample.demo.designpatterns.creational.Builder;

public class Phone {
    private String brand;
    private String model;
    private int price;
    private String color;


    public Phone(String brand, String model, int price, String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
