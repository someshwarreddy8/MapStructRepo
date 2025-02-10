package com.interviewpractice.sample.demo.designpatterns.creational.Builder;

public class BuilderDesignPattern {
    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", "x5", 12000, "Blue");

        Phone build = new PhoneBuilder().setBrand("Redmi").setColor("Yellow").build();

        System.out.println(build);
    }
}
