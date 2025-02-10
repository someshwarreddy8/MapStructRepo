package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.streams;

import java.util.Arrays;

public class FindFirst {
    public static void main(String[] args) {
        Integer even = Arrays.asList(1, 2, 3, 4).stream()
                .filter(t -> t % 2 == 0)
                .findFirst()
                .orElseGet(() -> 0);
//                .orElseThrow(() -> new RuntimeException("no data present"));
//                .ifPresent(t -> {
//                    t = t * 2;
//                    System.out.println(t);
//                });
    }
}
