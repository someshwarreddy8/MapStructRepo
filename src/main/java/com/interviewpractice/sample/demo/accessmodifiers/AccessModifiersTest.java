package com.interviewpractice.sample.demo.accessmodifiers;

final class AccessModifiersTest {
    public void publicTest() {
        System.out.println("from public modifier");
    }

    private void privateTest() {
        System.out.println("from private test");
    }

    protected void protectedTest() {
        System.out.println("from protected test.");
    }

    void defaultTest() {
        System.out.println("from defaultTest");
        privateTest();
    }
}
