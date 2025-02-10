package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 6, 7, 81, 1};

        int l = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i > l) {
                int temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
                l++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
