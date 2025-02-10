package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArrayKPositions {
    public static void main(String[] args) {
        Integer[] arr = {14, 4, 71, 81, 1};
        int positions = 3;
        rotateArrayKPositions(arr, positions);
    }

    private static void rotateArrayKPositions(Integer[] arr, int positions) {
        ArrayList<Integer> reqPositions = new ArrayList<>();

        reqPositions.addAll(Arrays.asList(arr).subList(arr.length-positions, arr.length));

        reqPositions.addAll(Arrays.asList(arr).subList(0, arr.length-positions));

        System.out.println(reqPositions);

    }
}
