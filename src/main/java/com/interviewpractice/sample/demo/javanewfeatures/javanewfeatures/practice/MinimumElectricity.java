package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice;

import java.util.PriorityQueue;

public class MinimumElectricity {
    public static int calculateMinimumElectricity(int[] cardboards) {
        // Use a min-heap (priority queue) to efficiently get the smallest two elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add all the cardboards to the min-heap
        for (int cardboard : cardboards) {
            minHeap.add(cardboard);
        }

        int totalElectricity = 0;

        // While there are more than one cardboard left, combine them
        while (minHeap.size() > 1) {
            // Get the two smallest elements
            int cardboard1 = minHeap.poll();
            int cardboard2 = minHeap.poll();

            // Calculate the electricity cost for this combination
            int cost = cardboard1 + cardboard2;
            totalElectricity += cost;

            // Add the combined cardboard back to the min-heap
            minHeap.add(cost);
        }

        return totalElectricity;
    }

    public static void main(String[] args) {
        int[] cardboards = {1, 2, 3, 4, 5};
        int result = calculateMinimumElectricity(cardboards);
        System.out.println("Minimum electricity required: " + result);
    }
}

