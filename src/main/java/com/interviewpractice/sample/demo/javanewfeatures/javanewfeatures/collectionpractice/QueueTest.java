package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.collectionpractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class QueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> data = new PriorityQueue<>();
        data.add(6);
        data.add(12);
        data.add(52);
        data.add(5);
        data.add(51);
        data.add(15);


        while (data.size() > 0) {
                Integer poll = data.poll();
                Integer poll1 = data.poll();
                System.out.println(data);
        }

    }
}
