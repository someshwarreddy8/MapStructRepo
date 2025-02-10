package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.strings;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "aabc";

        String s1 = "";

        for (Character ch : s.toCharArray()) {
            if (!s1.contains(ch + "")) {
                s1 += ch;
            }
        }

        System.out.println(s1);
    }
}
