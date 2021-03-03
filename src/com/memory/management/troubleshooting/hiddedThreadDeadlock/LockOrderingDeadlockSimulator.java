package com.memory.management.troubleshooting.hiddedThreadDeadlock;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LockOrderingDeadlockSimulator {

    public static void main(String[] args) {

        System.out.println("Hidden lock-ordering deadlock simulator");
        System.out.println("Author: Pierre-Hugues Charbonneau");
        System.out.println("http://javaeesupportpatterns.blogspot.com/");

        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch endSignal = new CountDownLatch(3);

        for (int i = 0; i < 1; i++) {
            Task newTask = new Task();

            ExecutorService executor = Executors.newFixedThreadPool(3);

            Runnable deadlockDetector = new ThreadDeadlockDetector(newTask, startSignal, endSignal);
            Runnable worker1 = new WorkerThread1(newTask, startSignal, endSignal);
            Runnable worker2 = new WorkerThread2(newTask, startSignal, endSignal);

            executor.execute(worker1);
            executor.execute(worker2);
            executor.execute(deadlockDetector);

            executor.shutdown();

            while (!executor.isTerminated()) {
                try {
                    endSignal.await();
                } catch (InterruptedException e) {

                }
            }

            System.out.println("LockOrderingDeadlockSimulator done!");
        }
    }
}
