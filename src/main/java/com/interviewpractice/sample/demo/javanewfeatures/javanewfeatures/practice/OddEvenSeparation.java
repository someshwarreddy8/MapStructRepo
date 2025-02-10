package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class OddEvenSeparation {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 12};

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }

        System.out.println("odd::: " + odd);
        System.out.println("even:: " + even);

    }
}
