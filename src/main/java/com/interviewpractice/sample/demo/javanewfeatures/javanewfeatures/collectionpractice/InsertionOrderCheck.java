package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.collectionpractice;

import java.util.*;

public class InsertionOrderCheck {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();

        List<Integer> integers1 = new ArrayList<>();

        System.out.println(integers1.add(null));
        System.out.println(integers1.add(null));
        System.out.println(integers1.add(null));


//        for (int i = 0; i <= 1000; i++) {
//            integers1.add(i);
//        }



//        Collections.reverse(integers1);

//        Collections.sort(integers1, Comparator.reverseOrder());
        Collections.reverse(integers1);

        List<Integer> streamData = integers1.stream()
                .sorted(Comparator.reverseOrder()).toList();

//        System.out.println(streamData);
//        System.out.println(integers1);

//        System.out.println(Collections.min(integers));
    }
}
