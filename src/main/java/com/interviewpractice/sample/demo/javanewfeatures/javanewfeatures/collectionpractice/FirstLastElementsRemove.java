package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.collectionpractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstLastElementsRemove {
    public static void main(String[] args) {
        int[] arr = {3,4,4,5,6};

        IntStream stream = Arrays.stream(arr);
        IntStream intStream = Arrays.stream(arr).filter(t -> t % 2 == 0);
        intStream.boxed().map(t -> { return t * 2; }).sorted(Comparator.reverseOrder()).findFirst().orElse(0);

        Stream.of(arr).toList();
        List<int[]> list = Stream.of(arr).toList();

        HashSet<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toCollection(HashSet::new));
        Arrays.stream(arr).boxed().filter(t->t%2==0 || t == 5).map(t->t*2).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> al = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(ArrayList::new));
        al.add(43);

        LinkedList<Integer> ll = new LinkedList<>(al);

        ll.add(2);
        ll.add(2);
        ll.add(1);
        ll.add(3);

        ll.removeFirst();
        ll.removeLast();

        LinkedList<Integer> streamData = al.stream().collect(Collectors.toCollection(LinkedList::new));
        Integer[] array = (Integer[]) streamData.toArray();
        System.out.println(streamData.addAll(ll));
        System.out.println(streamData);
    }
}
