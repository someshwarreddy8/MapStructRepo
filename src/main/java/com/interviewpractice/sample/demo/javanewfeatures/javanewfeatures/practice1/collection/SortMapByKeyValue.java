package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.collection;

import java.util.*;

public class SortMapByKeyValue {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(4, 4);
        map.put(3, 3);
        map.put(2, 2);
        map.put(1, 1);

//        TreeMap<Integer, Integer> tm = new TreeMap<>(map);
//        System.out.println(tm);

        ArrayList<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue());

        System.out.println(entries);

    }
}
