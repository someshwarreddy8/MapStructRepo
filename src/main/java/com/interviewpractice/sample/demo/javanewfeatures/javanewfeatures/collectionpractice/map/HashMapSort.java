package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.collectionpractice.map;

import java.util.*;

public class HashMapSort {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> integerHashMap = new LinkedHashMap<>();
        // Add values to the HashMap
        integerHashMap.put(1, 100);
        integerHashMap.put(3, 300);
        integerHashMap.put(2, 200);

//        System.out.println(integerHashMap);

        TreeMap<Integer, Integer> integers = new TreeMap<>(integerHashMap);
        Set entries = integers.entrySet();
        System.out.println(integers);
    }
}
