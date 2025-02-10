package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.collectionpractice.map;

import java.util.*;

public class SortMapWithKeyValue {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> sortingMap = new LinkedHashMap<>();
        // Add values to the HashMap
        sortingMap.put(1, 100);
        sortingMap.put(3, 300);
        sortingMap.put(12, 200);
        sortingMap.put(2, 250);
        sortingMap.put(22, 400);

       /* System.out.println("before sorting::: "+ sortingMap);
        TreeMap<Integer, Integer> sortedMapWithKeys = new TreeMap<>(sortingMap);
        System.out.println("after sorting based on key::: "+ sortedMapWithKeys);*/

        sortByValue(sortingMap);

    }

    private static void sortByValue(LinkedHashMap<Integer, Integer> sortingMap) {
        ArrayList<Map.Entry<Integer, Integer>> entries = new ArrayList<>(sortingMap.entrySet());

        entries.sort(Map.Entry.comparingByValue());

        System.out.println(entries);

    }
}
