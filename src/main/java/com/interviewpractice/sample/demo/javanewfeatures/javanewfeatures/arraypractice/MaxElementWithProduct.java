package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.arraypractice;

public class MaxElementWithProduct {
    public static void main(String[] args) {

        System.out.println(MaxElementWithProduct.findMaxElement());
    }

    private static int findMaxElement() {
        int[] arr = {4, 8, 7, 9, 7, 4};

        int maxEl = arr[0];
        int maxProd = arr[arr.length - 1] * arr[1];

        for (int i = 1; i < arr.length; i++) {
            if (arr.length < 3) {
                return -1;
            }


            int currentProd = arr[i - 1] * arr[(i + 1) % arr.length];
            if (currentProd > maxProd) {
                maxProd = currentProd;
                maxEl = arr[i];
            }
        }
        return maxEl;
    }
}

