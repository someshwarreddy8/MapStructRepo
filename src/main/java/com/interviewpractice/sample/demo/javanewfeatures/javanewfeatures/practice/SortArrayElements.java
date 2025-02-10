package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice;

import java.util.Arrays;

public class SortArrayElements {
    public static void main(String[] args) {
        int[] arr = {24, 13, 4, 15, 57, 69, 76, 7, 28, 49, 12};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
