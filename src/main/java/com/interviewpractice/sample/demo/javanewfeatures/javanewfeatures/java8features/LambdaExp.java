package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.java8features;

@FunctionalInterface
interface Demo {
    void test(int i);
}

class DemoImpl implements Demo {
    @Override
    public void test(int i) {
        System.out.println("This is demo impl.");
    }
}

public class LambdaExp {
    public static void main(String[] args) {
        Demo d = new DemoImpl();
//        d.test();

        Demo d1 = i -> {
            System.out.println("Lambda impl.");
            if(i%2==0 && i>3) {
                System.out.println(i);
            }
        };
        d1.test(4);
    }
}
