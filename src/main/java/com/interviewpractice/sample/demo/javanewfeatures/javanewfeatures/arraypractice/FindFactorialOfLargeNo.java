package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.arraypractice;

public class FindFactorialOfLargeNo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int fact = 1;
        for (int j = 1; j <= max; j++) {
            fact = fact * j;
        }

        System.out.println(fact);
    }
}
