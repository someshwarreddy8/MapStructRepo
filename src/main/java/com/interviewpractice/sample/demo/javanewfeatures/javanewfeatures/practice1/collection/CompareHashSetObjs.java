package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.collection;

import java.util.HashSet;

public class CompareHashSetObjs {
    public static void main(String[] args) {
        HashSet<Integer> obj1 = new HashSet<>();
        obj1.add(1);
        obj1.add(2);
        HashSet<Integer> obj2 = new HashSet<>();
        obj2.add(2);
        obj2.add(1);


        System.out.println(obj2.equals(obj1));
        System.out.println(obj1 == obj2);
    }
}
