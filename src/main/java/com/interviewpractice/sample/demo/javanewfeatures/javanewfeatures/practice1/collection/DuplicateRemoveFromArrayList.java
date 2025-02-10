package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemoveFromArrayList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 4, 4);

        HashSet<Integer> elements = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int el : list) {
            if (!elements.add(el)) {
                duplicates.add(el);
            }
        }

        System.out.println(Arrays.toString(duplicates.toArray(Integer[]::new)));

    }
}
