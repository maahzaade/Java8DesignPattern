package com.memory.management.troubleshooting.hiddedThreadDeadlock;

import java.util.concurrent.CountDownLatch;

public class WorkerThread2 implements Runnable {
    private final CountDownLatch startSignal;
    private final CountDownLatch endSignal;
    private Task task = null;

    public WorkerThread2(Task task, CountDownLatch startSignal, CountDownLatch endSignal) {
        this.task = task;
        this.startSignal = startSignal;
        this.endSignal = endSignal;
    }

    @Override
    public void run() {
        try {
            startSignal.await();
            task.executeTask2();
        } catch (InterruptedException e) {

        } finally {
            endSignal.countDown();
        }
    }
}
