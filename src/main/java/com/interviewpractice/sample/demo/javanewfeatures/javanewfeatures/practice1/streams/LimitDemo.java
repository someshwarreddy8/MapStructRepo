package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class LimitDemo {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
    }
}
