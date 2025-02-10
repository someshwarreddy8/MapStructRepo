package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.arraypractice;

public class OccurenceOfIneger {

    public static void main(String[] args) {
        OccurenceOfIneger.findOccurenceOfInteger(6);
    }

    private static void findOccurenceOfInteger(int num) {
        int[] arr = {6, 5, 7, 8, 9, 9,9,9,9,6,9,9,9,9,9,99, 5, 5, 7};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]) {
                count++;

            }
        }

        System.out.println(count);

    }
}
