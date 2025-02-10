package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.streams;

import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
       try {
           Stream.of("alien", "sumo", " bench press")
                   .map(t -> {
                       t = t.trim();
                       return t.substring(0, 1).toUpperCase() + t.substring(1).toLowerCase();
                   })
                   .forEach(System.out::println);
       } catch (NullPointerException e) {

       }

        MapDemo child = new Child();
        child.test(1);
    }

    public int test(int i) {
        return i;
    }

    public void test(int i, int j) {
//        return i;
    }
}
class Child extends MapDemo{
    @Override
    public int test(int i) {
        return i;
    }
}
