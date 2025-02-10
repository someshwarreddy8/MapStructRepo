package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        Integer[] arr = {14, 4, 4, 6, 71, 71, 81, 1};
        HashSet<Integer> uniqueVals = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!uniqueVals.add(arr[i])) {
                duplicates.add(arr[i]);
            }
        }

        System.out.println(Collections.max(duplicates));
        System.out.println(duplicates);
    }
}
