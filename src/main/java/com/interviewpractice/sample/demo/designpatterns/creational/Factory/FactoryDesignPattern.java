package com.interviewpractice.sample.demo.designpatterns.creational.Factory;

import org.apache.commons.lang3.StringUtils;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        String s = null;
        if(StringUtils.isBlank(s)){

        }
        //OPEN //SECURED
        OS os = osFactory.openOS("win");
        os.spec();
    }
}
