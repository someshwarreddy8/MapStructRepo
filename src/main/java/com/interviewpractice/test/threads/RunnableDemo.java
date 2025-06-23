package com.interviewpractice.test.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo extends Main implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " " + Thread.currentThread().getName() + " is Running.");
    }

}

class Main {
    public static void main(String[] args) {
//            Thread thread = new Thread(new RunnableDemo());
       /* for (int i = 0; i < 6; i++) {
            Runnable runnable = () -> System.out.println(Thread.currentThread().getName());
            Thread thread1 = new Thread(runnable);
            thread1.start();
        } */

        ExecutorService teamManager = Executors.newFixedThreadPool(2);

        // 5 balls to be bowled (tasks)
        for (int i = 1; i <= 5; i++) {
            int ballNumber = i;
            Runnable bowlBall = () -> {
                System.out.println("Ball " + ballNumber + " bowled by " + Thread.currentThread().getName());
            };
            teamManager.submit(bowlBall);
        }

        // No more balls to assign
        teamManager.shutdown();
    }
}
