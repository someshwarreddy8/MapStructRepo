package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.arrays;

import java.util.PriorityQueue;

public class FindNthLargestElementInArray {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 6, 7, 81, 1};

        int nThLargest = 4;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int val : arr) {

            minHeap.add(val);
            if (minHeap.size() > nThLargest) {
                minHeap.poll();
            }
        }

        System.out.println(minHeap.peek());

    }
}
