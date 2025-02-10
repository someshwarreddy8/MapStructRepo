package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice;

import java.util.HashSet;
import java.util.Set;

public class FindZeroSumPairs {
    public static void findZeroSumPairs(int[] array) {
        Set<Integer> seen = new HashSet<>();
        Set<String> result = new HashSet<>();

        for (int num : array) {
            // Check if the complement (i.e., -num) exists in the seen set
            if (seen.contains(-num)) {
                // Store the pair in a sorted order to avoid duplicate pairs like {4, -4} and {-4, 4}
                result.add(num + ", " + -num);
            } else {
                // Add the current number to the seen set
                seen.add(num);
            }
        }

        // Print the result
        for (String pair : result) {
            System.out.println("Pair: {" + pair + "}");
        }
    }

    public static void main(String[] args) {
        int[] array = {4, -4, 1};
        findZeroSumPairs(array);
    }
}

