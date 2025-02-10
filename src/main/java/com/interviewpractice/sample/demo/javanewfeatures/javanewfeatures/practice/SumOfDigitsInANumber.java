package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice;

public class SumOfDigitsInANumber {
    public static void main(String[] args) {

        String word = "reverse";



        int no = 1234, sum = 0;

        String s = String.valueOf(no);
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        System.out.println(sum);
    }
}
