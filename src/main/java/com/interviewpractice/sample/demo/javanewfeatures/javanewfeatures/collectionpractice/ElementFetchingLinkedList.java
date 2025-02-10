package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.collectionpractice;

import java.util.*;

public class ElementFetchingLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(2);
        integers.add(2);
        integers.add(1);
        integers.add(3);

        Set<Integer> list1 = new HashSet<>(integers);
        System.out.println(list1);

        int[] arr = {1,2,2,4,5,5};

        HashSet<Integer> ints = new HashSet<>();
        for(int i: arr) {
            ints.add(i);
        }

        System.out.println(ints);


//        for(int i=0; i<integers.size(); i++) {
//            System.out.println("value at index " + i + " is::: " + integers.get(i));
//        }

//        Collections.sort(integers);
//        Collections.reverse(integers);

        List<Integer> list = integers.stream().sorted(Comparator.reverseOrder()).toList();

//        System.out.println(list);

//        System.out.println(integers);
    }
}
