package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.collectionpractice.userdefined;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Processing {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(13, "abc"), new Student(2, "bcd"), new Student(3, "cde"));
        Integer[] a = {1,2,3};
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(a));

        students.stream()
//                .map(Student::getName)
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);
//        System.out.println(count);
//                .count();
//                .sorted(Comparator.comparing(Student::getId))
//                .collect(Collectors.toCollection(ArrayList::new))
//                .forEach(System.out::println);


    }
}
