package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.strings;

import java.util.HashMap;

public class CountCharOccurence {
    public static void main(String[] args) {
        String word = "abcaded";

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : word.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        System.out.println(map);
    }
}
