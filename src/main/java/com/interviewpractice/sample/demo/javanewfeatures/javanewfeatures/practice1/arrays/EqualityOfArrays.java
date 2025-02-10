package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.arrays;

import java.util.Arrays;

public class EqualityOfArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr1 = {1, 2, 3};

        boolean equals = Arrays.equals(arr, arr1);
        if (equals) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        boolean flag = false;

        if (arr.length != arr1.length) {
            System.out.println("Not equal");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr1[i]) {
                flag = true;
                System.out.println("Not equal");
            }
        }

        if (!flag) {
            System.out.println("Equal");
        }
    }
}
