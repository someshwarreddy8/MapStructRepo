package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedArraysIntoOneSortedArray {
    public static void main(String[] args) {
        Integer[] arr = {14, 4, 71, 81, 1};
        Integer[] arr1 = {91, 43, 41, 82, 1};

        sortArray(arr);
        sortArray(arr1);

        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(Arrays.asList(arr));
        result.addAll(Arrays.asList(arr1));
        Integer[] array = result.toArray(Integer[]::new);
        sortArray(array);

        System.out.println(Arrays.toString(array));


    }

    private static void sortArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
