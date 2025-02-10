package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice;

import org.apache.commons.lang3.StringUtils;

public class StringPalindrome {
    public static void main(String[] args) {
        String word = "Tomot";
        checkPalindrome(word);
    }

    private static void checkPalindrome(String word) {
        if (StringUtils.isBlank(word)) {
            System.out.println("The word is a palindrome.");
            return;
        }
        StringBuilder reverse = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse.append(word.charAt(i));
        }

        if (word.equalsIgnoreCase(reverse.toString())) {
            System.out.println(word + " is palindrome.");
        } else {
            System.out.println("not a palindrome.");
        }
    }
}
