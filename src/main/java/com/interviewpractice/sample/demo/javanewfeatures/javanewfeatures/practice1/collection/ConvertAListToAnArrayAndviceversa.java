package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.collection;

import com.interviewpractice.sample.demo.Product;

import java.util.*;

public class ConvertAListToAnArrayAndviceversa {
    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);

        Integer[] array = elements.toArray(Integer[]::new);
        Integer[] arr = {32, 2, 1, 4};

        List<Product> list = Arrays.asList(new Product(1L, "a", "a", 12.00, 7, 9, "a"));
        list.stream().sorted(Comparator.comparing(Product::getProductId).reversed().reversed());


    }
}
