package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice;

import java.util.Arrays;
import java.util.Comparator;

public class FindPercentage {
    public static void main(String[] args) {
        //how to find 5% of 100.

        int percentage = 5;
        int number = 100;

        int disc = (percentage * number) / 100;

//        System.out.println(disc);

        int[] arr = {400, 500, 600, 700, 1000};

        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .filter(t -> t > 400 && t < 1000)
                .map(t -> {
                    int discount = (t * 5) / 100;
                    return t - discount;
                }).forEach(System.out::println);

    }
}
