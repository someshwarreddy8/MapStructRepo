package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice;

import java.util.*;
import java.util.stream.Collectors;

public class RemvoeDuplicatesFromArray {
    public static void main(String[] args) {

        String s = "reverse";
        ArrayList<String> strings = new ArrayList<>();
        strings.add(s);

        Set<String> collect = strings.stream()
                .map(t -> new StringBuilder(t).reverse().toString()).collect(Collectors.toSet());
        System.out.println(collect);

        Integer[] arr = {2, 3, 4, 5, 5, 6, 6, 7, 8, 9, 12};

        Set<Integer> val = Arrays.stream(arr).collect(Collectors.toSet());

//        System.out.println(val);

    }
}
