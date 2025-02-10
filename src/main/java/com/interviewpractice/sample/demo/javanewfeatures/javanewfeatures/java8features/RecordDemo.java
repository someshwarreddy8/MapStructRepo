package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.java8features;

public class RecordDemo {
    public static void main(String[] args) {
//        Student yxz = new Student(2, "yxz");
        Student uvc = new Student(0, "yxz");

//        System.out.println(yxz);
        System.out.println(uvc);

//        System.out.println(yxz.equals(uvc));
    }
}

record Student(int id, String name) {

    public Student {
        if (id == 0)
            throw new IllegalArgumentException("This is illegal arg...");
    }
}
