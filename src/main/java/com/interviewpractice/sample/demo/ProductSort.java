package com.interviewpractice.sample.demo;

import java.util.*;
import java.util.stream.Collectors;

public class ProductSort {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(4L, "Abc", "Electronics", 100, 5, 4, "Puma"));
        products.add(new Product(6L, "ProAbc1", "Clothing", 100, 14, 5, "Puma1"));
        products.add(new Product(5L, "Abc2", "Groceries", 200, 51, 3, "Puma2"));
        products.add(new Product(3L, "Abc3", "Clothing", 180, 25, 2, "Puma3"));
        products.add(new Product(12L, "ProAbc4X", "Groceries", 190, 45, 4, "Puma4"));
        products.add(new Product(9L, "Abc5", "Electronics", 130, 55, 1, "Puma5"));

        Comparator<Product> productComparator = new Comparator<Product>() {

            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getProductId() > o2.getProductId())
                    return 1;
                else
                    return -1;
            }
        };
        List<Product> collect = products.stream().sorted(Comparator.comparing(Product::getProductId).reversed()).collect(Collectors.toList());
        Collections.sort(products, productComparator.reversed());
    //        Collections.sort(products, (o1, o2) -> {
    //            if (o1.getProductId() > o2.getProductId())
    //                return 1;
    //            else
    //                return -1;
    //        });
        System.out.println(products);


//        Collections.sort(products, (obj1, obj2)-> obj1.getProductPrice()- obj2.getProductPrice());

        List<Product> categorySortedInAscOrder = products.stream()
                .sorted(Comparator.comparing(Product::getProductCategory).reversed())
                .toList();
//        System.out.println(categorySortedInAscOrder);

        long count = products.stream().filter(t -> t.getProductName().startsWith("pro") || t.getProductName().endsWith("X")).count();
//        System.out.println(count);

        List<Product> priceDrop = products.stream().filter(t -> t.getProductRating() >= 4)
                .peek(t -> t.setProductPrice(t.getProductPrice() - ((double) 5 / 100) * t.getProductPrice())).toList();

//        System.out.println(priceDrop);


//        List<String> list = products.stream().map(Product::getProductName).filter(t -> t.startsWith("A")).toList();
//        System.out.println(list);


//        products.stream().sorted(Comparator.comparing())


//        products.stream().filter(t-> t.getProductName().contains("Pro")).map(t-> {
//            for(int i=t.getProductName().length()-1; i< ; i++) {
//                if(t.getProductName().charAt(i))
//            }
//        })

//        System.out.println(products);

//        products.stream().sorted(t-> t.getProductCategory()).toList();

    }
}
