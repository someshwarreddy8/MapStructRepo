package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        Collections.reverse(names);

        System.out.println(names);




    }
}
