package com.interviewpractice.sample.demo.designpatterns.creational.Factory;

public class OSFactory {

    public OS openOS(String type) {
        if (type.equalsIgnoreCase("OPEN")) {
            return new Android();
        } else if (type.equalsIgnoreCase("SECURED")) {
            return new IOS();
        } else {
            return new Windows();
        }
    }

}
