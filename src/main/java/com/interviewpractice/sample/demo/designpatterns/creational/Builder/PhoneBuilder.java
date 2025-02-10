package com.interviewpractice.sample.demo.designpatterns.creational.Builder;

public class PhoneBuilder {
    private String brand;
    private String model;
    private int price;
    private String color;

    public PhoneBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public PhoneBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public PhoneBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Phone build() {
       return new Phone(brand, model, price, color);
    }
}
