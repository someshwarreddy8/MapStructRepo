package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.java8features;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NTTDemo {
    public static void main(String[] args) {
        List<NTTPojo> nttPojos = List.of(new NTTPojo("ABC", "xyz", new int[]{2, 3, 4}, List.of(1000, 2000)),
                new NTTPojo("ABC", "xyz", new int[]{3, 4, 5, 6}, List.of(6000, 4000)));

        List<NTTPojo> nttPojos1 = Collections.unmodifiableList(nttPojos); //creates an unmodifiableList.

        List<NTTPojo> list = nttPojos.stream()
                .filter(t -> t.getName().equalsIgnoreCase("ABC")
                        && t.getDept().equalsIgnoreCase("xyz")
                        && Arrays.stream(t.getSal()).sum() < 4000
                        && t.getSalary().stream().mapToInt(Integer::intValue).sum() < 4000).toList();

        System.out.println(list);
    }
}
