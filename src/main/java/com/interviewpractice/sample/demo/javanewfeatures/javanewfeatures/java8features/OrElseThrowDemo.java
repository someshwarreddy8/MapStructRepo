package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.java8features;

import java.util.Optional;

public class OrElseThrowDemo {
    public static void main(String[] args) {
        Optional<String> s = Optional.of("Hello world!!!");
        String s1 = s.orElseThrow(RuntimeException::new);
//        System.out.println(s1);

        Optional<String> empty = Optional.empty();
        String s2 = empty.orElseThrow();
        System.out.println(s2);


    }
}
