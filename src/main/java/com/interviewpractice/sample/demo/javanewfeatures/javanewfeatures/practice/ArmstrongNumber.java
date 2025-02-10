package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int no = 153;
        int sum = 0;
        String converted = String.valueOf(no);
        int length = converted.length();

        for (int i = 0; i < length; i++) {
            char c = converted.charAt(i);
            int digit = c - '0';

            sum += Math.pow(digit, length);
        }

        if (sum == no) {
            System.out.println("no is Armstrong no!!!");
        } else {
            System.out.println("not an Armstrong no");
        }
    }
}
