package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.java8features;

public class SealedDemo {
    public static void main(String[] args) {
        D d = new D();
        d.result();
    }
}

sealed class A permits B, C {
    public void result() {
        System.out.println("from sealed class");
    }
}

sealed class B extends A permits D {

}

non-sealed class C extends A {

}

final class D extends B {

}