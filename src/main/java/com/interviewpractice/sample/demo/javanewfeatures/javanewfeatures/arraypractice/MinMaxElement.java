package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.arraypractice;

import java.util.Arrays;
import java.util.Collections;

public class MinMaxElement {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 6, 8, 7};

        Integer min1 = Collections.min(Arrays.stream(arr).boxed().toList());
        Integer max1 = Collections.max(Arrays.stream(arr).boxed().toList());

        System.out.println("min1::: "+ min1 + " max::: "+max1);


        int min = arr[0];
        int max = arr[0];

        //array rotation from left
        int[] temp= new int[arr.length];
        int j=0;
        for(int i=arr.length-1; i>=0; i--) {
            temp[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(temp));

        //Min / Max
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
//        System.out.println(min);
//        System.out.println(max);
    }
}
