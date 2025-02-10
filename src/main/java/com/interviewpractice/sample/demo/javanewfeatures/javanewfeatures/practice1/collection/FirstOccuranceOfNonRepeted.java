package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstOccuranceOfNonRepeted {
    public static void main(String[] args) {
        String word = "Hhelloworld";

        HashMap<Character, Integer> map = new LinkedHashMap<>();
        char[] charArray = word.toLowerCase().toCharArray();

        for (Character ch : charArray) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        for(Character ch : charArray) {
            if (map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }


    }
}
