package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Fibonacci {
    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//        System.out.println(map.put(1, "a"));
//        System.out.println(map.put(1, "b"));

//        ArrayList<Integer> integers = new ArrayList<>();
//        System.out.println(integers.add(1));
//        System.out.println(integers.add(1));

        HashSet<Integer> integers = new HashSet<>();
        System.out.println(integers.add(1));
        System.out.println(integers.add(1));

//        Fibonacci.countFibonacci(20);
    }

    private static void countFibonacci(int num) {

        int j = 0, k = 1, sum = 0;
        System.out.print(j + " " + k);
        for (int i = 1; i < num; i++) {
            sum = j + k;
            System.out.print(" " + sum);

            j = k;
            k = sum;
        }

    }
}
