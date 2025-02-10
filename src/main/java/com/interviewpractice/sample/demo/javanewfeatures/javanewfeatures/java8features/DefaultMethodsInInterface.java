package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.java8features;

@FunctionalInterface
interface Test {
    void demo();

   default void defaultTest() {
        System.out.println("In default method");
       privateMethod("hey you!!");
    }

    static void staticTest(String name) {
        System.out.println("staic method name::" + name);
    }

    private String privateMethod(String data) {
        System.out.println("in private method");
       return data;
    }
}


class TestImple implements Test {

    @Override
    public void demo() {
        System.out.println("this is a impl method");
    }
}

public class DefaultMethodsInInterface {
    public static void main(String[] args) {
        TestImple testImple = new TestImple();
        testImple.demo();
        testImple.defaultTest();

        Test.staticTest("Varan dhavan");
    }
}
