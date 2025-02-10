package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.arraypractice;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {4, 37, 3, 12, 9, 0, 1};

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                int temp = 0;
//                if (arr[i] > arr[j]) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        Arrays.stream(arr).forEach(System.out::print);
    }
}
