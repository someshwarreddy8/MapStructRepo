package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 5};

        HashSet<Integer> integers = new HashSet<>();

        int[] array = Arrays.stream(arr).distinct().toArray();

        System.out.println(Arrays.toString(array));

        for (int val : arr) {
            integers.add(val);
        }
//        System.out.println(integers);
    }
}



