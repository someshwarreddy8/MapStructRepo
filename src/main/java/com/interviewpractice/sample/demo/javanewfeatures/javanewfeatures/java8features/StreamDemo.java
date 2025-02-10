package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.java8features;

import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 11, 10, 9);

        Integer i = integers.stream()
                .filter(integer -> integer % 2 == 0 && integer instanceof Integer)
                .findFirst()
                .orElseGet(() -> 0);
//                .forEach(integer -> System.out.println(integer));
//        System.out.println(i);

//        integers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<DemoPojo> demoPojos = List.of(new DemoPojo(1, "xyz", 34L), new DemoPojo(14, "abc", 32L), new DemoPojo(4, "def", 32L), new DemoPojo(3, "jkl", 33L));

        List<String> list = demoPojos.stream().filter(pojo -> pojo.getId() % 2 == 0).map(x-> x.getName()).sorted().toList();

        list.forEach(name -> {
            System.out.println(name);
        });
    }
}
