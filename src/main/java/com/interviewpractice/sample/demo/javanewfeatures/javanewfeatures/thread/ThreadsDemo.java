package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.thread;

public class ThreadsDemo {
    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        trigger();
        Thread.sleep(2000);
        System.out.println(counter);
    }

    public static void trigger() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                ThreadsDemo.counter++;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                ThreadsDemo.counter++;
            }
        });

        t1.start();
        t2.start();
    }
}
