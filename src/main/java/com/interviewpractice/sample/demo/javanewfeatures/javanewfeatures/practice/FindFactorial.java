package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice;

public class FindFactorial {
    public static void main(String[] args) {
        int no = 4;
        int fact = 1;
        for (int i = 2; i <= no; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

}
