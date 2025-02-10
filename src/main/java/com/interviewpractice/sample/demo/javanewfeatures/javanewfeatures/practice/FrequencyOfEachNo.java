package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FrequencyOfEachNo {
    public static void main(String[] args) {

        Integer[] elements = {1, 1, 1, 22, 33, 33, 4, 4, 5, 6, 6, 9, 9, 9, 9, 0};

        HashMap<Integer, Integer> frequencyCheck = new HashMap<>();
//Traditional way.
        for (Integer i : elements) {
            if (frequencyCheck.containsKey(i)) {
                frequencyCheck.put(i, frequencyCheck.get(i) + 1);
            } else {
                frequencyCheck.put(i, 1);
            }
        }

        //Using Stream API.
//        Arrays.stream(elements).forEach(t -> {
//            if (frequencyCheck.containsKey(t)) {
//                frequencyCheck.put(t, frequencyCheck.get(t) + 1);
//            } else {
//                frequencyCheck.put(t, 1);
//            }
//        });

        System.out.println("frequencyCheck::: " + frequencyCheck);


        String word = "This is a frequency check of each number in a string in java";
        HashMap<Character, Integer> charFrequencyCheck = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (!StringUtils.isBlank(String.valueOf(word.charAt(i)))) {
                if (!charFrequencyCheck.containsKey(word.charAt(i))) {
                    charFrequencyCheck.put(word.charAt(i), 1);
                } else {
                    charFrequencyCheck.put(word.charAt(i), charFrequencyCheck.get(word.charAt(i)) + 1);
                }
            }
        }

        System.out.println(charFrequencyCheck);


        char[] charArray = word.toCharArray();

        HashMap<Character, Integer> charCounter = new HashMap<>();
        ArrayList<Character> characters = new ArrayList<>();

        for (Character cha : charArray) {
            characters.add(cha);
        }

        characters.stream().filter(ch -> !Character.isWhitespace(ch)).forEach(ch -> {

            if (!charCounter.containsKey(ch)) {
                charCounter.put(ch, 1);
            } else {
                charCounter.put(ch, charCounter.get(ch) + 1);
            }
        });

        System.out.println(charCounter);
    }
}
