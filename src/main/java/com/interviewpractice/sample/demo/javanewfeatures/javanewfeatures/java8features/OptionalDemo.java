package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.java8features;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {


        try {
            Optional<User> user = Optional.of(new User(1, "xyz"));
//        if(user.isPresent()) {
//            System.out.println(user.get());
//        }

            Optional<User> user1 = Optional.ofNullable(null);
            User user2 = user1.orElse(new User(0, ""));
            System.out.println(user2);
            if(user1.isPresent()) {
                System.out.println(user1.get());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
