package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.arraypractice;

import java.util.ArrayList;
import java.util.List;

public class ToArrayOfCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        String[] array = list.toArray(String[]::new);
        for (String arr : array) {
            System.out.println(arr);
        }
    }
}
