package com.interviewpractice.sample.demo.controller;

//import com.interviewpractice.sample.demo.accessmodifiers.AccessModifiersTest;
import com.interviewpractice.sample.demo.accessmodifiers.ProtectedTestSamePkg;

public class ProtectedSubClassTestOutSidePkg {
    public void accessMethods() {
//        protectedTest();
    }
    public static void main(String[] args) {
        ProtectedSubClassTestOutSidePkg protectedSubClassTestOutSidePkg = new ProtectedSubClassTestOutSidePkg();
        protectedSubClassTestOutSidePkg.accessMethods();

        ProtectedTestSamePkg protectedTestSamePkg = new ProtectedTestSamePkg();
        protectedTestSamePkg.runAccessModifierMethods();
    }
}
