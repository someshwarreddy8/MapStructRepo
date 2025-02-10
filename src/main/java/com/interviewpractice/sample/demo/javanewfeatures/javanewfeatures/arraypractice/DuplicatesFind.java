package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.arraypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicatesFind {
    public static void main(String[] args) {
        int[] arr = {6, 5, 7, 8, 9, 9, 5, 5, 7};
        ArrayList<Integer> temp = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            for (int k = i + 1; k < arr.length; k++) {
//                if (arr[i] == arr[k]) {
//                    temp.add(arr[i]);
//                    break;
//                }
//            }
//        }
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    integers.add(arr[i]);
                }
            }
        }

        System.out.println(Arrays.toString(integers.toArray()));
    }
}
