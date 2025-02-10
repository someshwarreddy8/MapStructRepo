package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinMaxElementInArray {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 6, 7, 81, 1};

        //Approach-1
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min:: "+min+" Max:: "+max);

        //Approach-2
        ArrayList arrayList = new ArrayList<>(Arrays.asList(arr));
        Comparable min1 = Collections.min(arrayList);
        Comparable max1 = Collections.max(arrayList);
        System.out.println("Min1:: " + min1 + " Max1:: " + max1);

    }
}
