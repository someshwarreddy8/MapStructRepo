package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StringConcatination {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("def");
        strings.add("ghi");
        strings.add("jkl");
        strings.add("mno");

        String collect = strings.stream()
                .map(t -> "[" + t + "]")
                .collect(Collectors.joining(","));
    }
}
