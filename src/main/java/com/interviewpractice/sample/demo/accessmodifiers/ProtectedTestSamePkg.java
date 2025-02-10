package com.interviewpractice.sample.demo.accessmodifiers;

public class ProtectedTestSamePkg {
    public void runAccessModifierMethods() {
        AccessModifiersTest accessModifiersTest = new AccessModifiersTest();
        accessModifiersTest.protectedTest();
        accessModifiersTest.defaultTest();
        accessModifiersTest.publicTest();
    }

    public static void main(String[] args) {
        ProtectedTestSamePkg protectedTestSamePkg = new ProtectedTestSamePkg();
        protectedTestSamePkg.runAccessModifierMethods();
    }
}
