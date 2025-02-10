package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.collectionpractice;

import java.util.*;
import java.util.stream.Collectors;

public class FindMaxElement {
    public static void main(String[] args) {

        int[] arr = {54, 4, 5, 6, 1, 8};




        ArrayList<Integer> initial = new ArrayList<>();
        initial.add(90);

        ArrayList<Integer> integers = new ArrayList<>(initial);
        for (int no : arr) {
            integers.add(no);
        }
        ArrayList<Integer> integers1 = new ArrayList<>(integers);

        integers.addAll(integers1);

//        System.out.println("integers::: "+integers);

        Integer firstElementInLast = integers.stream().findFirst().orElseGet(null);
        System.out.println("firstElementInLast:: " + firstElementInLast);


        Collections.sort(integers);
        Collections.reverse(integers);

        Set<Integer> collect = new TreeSet<>(integers);
        int max3 = Integer.MIN_VALUE;
        for (int i : collect) {
            if (max3 < i) {
                max3 = i;
            }
        }

        System.out.println("max3:: " + max3);

        int min = arr[0];
        int max2 = arr[0];

        for (int no : arr) {
            if (no < min) {
                min = no;
            } else if (no > max2) {
                max2 = no;
            }
        }

        System.out.println(min);
        System.out.println(max2);


        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(3);
        elements.add(7);
        elements.add(87);
        elements.add(98);
        elements.add(9);

        elements.stream().sorted(Comparator.reverseOrder());

        Integer max = Collections.max(elements);
        int max1 = Integer.MIN_VALUE;

        for (int no : elements) {
            if (no > max1) {
                max1 = no;
            }
        }

        System.out.println(max1);

        int minValue = Integer.MAX_VALUE;
        System.out.println(minValue);
    }
}
