package com.memory.management.troubleshooting.hiddedThreadDeadlock;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.CountDownLatch;

public class ThreadDeadlockDetector implements Runnable {

    private final CountDownLatch startSignal;
    private final CountDownLatch endSignal;
    private Task task = null;

    public ThreadDeadlockDetector(Task task, CountDownLatch startSignal, CountDownLatch endSignal) {
        this.task = task;
        this.startSignal = startSignal;
        this.endSignal = endSignal;
    }

    @Override
    public void run() {
        try {
            startSignal.await();
            for (int i = 0; i < 10; i++) {
                ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
                long[] threadIds = threadBean.findDeadlockedThreads();
                int deadlockThreads = threadIds != null ? threadIds.length : 0;
                System.out.println("\n** Deadlock detection in progress...");
                System.out.println("Deadlocked threads found by the HotSpot JVM: " + deadlockThreads);
                System.out.println("Read lock count: " + task.getReentrantReadWriteLock().getReadHoldCount());
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        } catch (InterruptedException e) {

        } finally {
            endSignal.countDown();
        }
    }
}
