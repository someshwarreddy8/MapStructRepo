package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice;

import java.util.List;

public class HackerRank1 {
    public static void main(String[] args) {
        int validateWords = validateWords("This is Form16 submiss$ion date");
        System.out.println(validateWords);
    }

    private static int validateWords(String words) {
        int validWordCount = 0;
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        String s="demo";
        char[] charArray = s.toCharArray();

        String[] wordsArr = words.split("\\s+");
        for (int i = 0; i < wordsArr.length; i++) {
            String aWord = wordsArr[i];
            if (aWord.length() > 3
                    && aWord.chars().allMatch(Character::isLetterOrDigit)
                    && aWord.toLowerCase().chars().anyMatch(ch -> vowels.contains((char) ch))
                    && aWord.toLowerCase().chars().anyMatch(ch -> Character.isLetter(ch) && !vowels.contains(ch))) {
                validWordCount++;
            }
        }
        return validWordCount;
    }
}