package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.collectionpractice;

import java.util.*;

public class RemoveSpecificElementFromCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.stream(new Integer[]{1, 2, 3, 45, 1, 5}).toList());
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> integers = new ArrayList<>();
        Collections.reverse(list);
//        if(list.contains(1)) {
//            list.remove((Integer) 1);
//        }

        for(int i=0; i<2; i++) {
//            Integer remove = list.remove(0);
            Integer remove = list.remove(list.size() - 1);
            stack.push(remove);
        }
       while(!stack.isEmpty()) {
           integers.add(stack.pop());
       }
        integers.addAll(list);

        System.out.println(Arrays.toString(integers.toArray(Integer[]::new)));

    }
}
