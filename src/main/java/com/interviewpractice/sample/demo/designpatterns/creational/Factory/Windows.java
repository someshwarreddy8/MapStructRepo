package com.interviewpractice.sample.demo.designpatterns.creational.Factory;

public class Windows implements OS{
    @Override
    public void spec() {
        System.out.println("This is windows os");
    }
}
