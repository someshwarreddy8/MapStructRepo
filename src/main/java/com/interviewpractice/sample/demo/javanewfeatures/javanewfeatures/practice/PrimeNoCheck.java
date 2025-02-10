package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice;

import java.util.HashSet;

public class PrimeNoCheck {
    public static void main(String[] args) {
        int i = -4;
        HashSet<Integer> integers = new HashSet<>();
//        integers.add(-1);
        System.out.println(-i);
//        checkPrimeNumber(17);
    }

    private static void checkPrimeNumber(int no) {
        boolean flag = false;
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                flag = true;
                System.out.println(no + " is not prime.");
                break;
            }
        }
        if (!flag) {
            System.out.println(no + " is prime");
        }
    }
}
