package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.arraypractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContainsTest {
    public static void main(String[] args) {
        int[] arr = {4, 8, 7, 9, 7, 4};
        Integer[] arr12 = {4, 8, 7, 9, 7, 4};

        ArrayList<Integer> collect1 = Stream.of(1, 2, 3, 4).filter(t -> t % 2 == 0).collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Integer> integers1 = new ArrayList<>(Arrays.asList(arr12));
        integers1.add(41);
        System.out.println(integers1);

        ArrayList<Integer> integers = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        HashSet<Integer> hashset = Arrays.stream(arr).boxed().collect(Collectors.toCollection(HashSet::new));
//        boolean contains = integers.contains(4);

        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Cherry");
        stringList.add("Banana");

        Set<String> fruitSet = new TreeSet<>(stringList);

        //Collection to array
        String[] array = stringList.toArray(String[]::new);
//        System.out.println(Arrays.toString(array));
//        System.out.println(array[0]);

        Integer[] arr1 = {4, 8, 7, 9, 7, 4};
        HashSet<Integer> collect = Arrays.stream(arr1).collect(Collectors.toCollection(HashSet::new));
        Integer[] arrint = collect.toArray(new Integer[collect.size()]);
//        System.out.println(Arrays.toString(arrint));

    }
}
