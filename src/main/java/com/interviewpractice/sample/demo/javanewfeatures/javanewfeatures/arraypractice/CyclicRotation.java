package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.arraypractice;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        CyclicRotation.rotate(3);
    }

    private static void rotate(int i) {
        int[] arr = {6, 5, 7, 8, 9};
        int[] temp = new int[arr.length];
        int k = 0;

        for (int j = arr.length - i; j <= arr.length - 1; j++) {
            temp[k] = arr[j];
            k++;
        }

        for (int l = 0; l < arr.length - i; l++) {
            temp[k] = arr[l];
            k++;
        }

        System.out.println(Arrays.toString(temp));
    }
}
