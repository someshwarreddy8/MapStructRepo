package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RepeatElementsInString {
    public static void main(String[] args) {
        String word = "repeat";

        HashSet<Character> characters = new HashSet<>();
        ArrayList<Character> characters1 = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (!characters.add(word.charAt(i))) {
                characters1.add(word.charAt(i));
            } else {
                characters.add(word.charAt(i));
            }
        }

        System.out.println(characters1);
    }
}
