package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindNthLargestElement {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 6, 7, 9, 10, 21};

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int el : arr) {
            minHeap.add(el);
            if (minHeap.size() > 2) {
                minHeap.poll();
            }
        }
        System.out.println(minHeap.poll());
    }
}
