package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public class TopKElement {
    public static void main(String[] args) {
        HashSet<Integer> elements = new HashSet<>();
        elements.add(5);
        elements.add(15);
        elements.add(12);
        elements.add(21);
        elements.add(17);
        elements.add(11);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int e : elements) {
            maxHeap.add(e);
        }
        System.out.println(maxHeap.peek());

        PriorityQueue<Integer> pq = new PriorityQueue<>(elements);
        while(pq.size()>3){
            pq.poll();
        }

//        System.out.println(pq.poll());

    }
}
