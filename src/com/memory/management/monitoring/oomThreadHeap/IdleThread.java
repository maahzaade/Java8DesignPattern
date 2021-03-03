package com.memory.management.monitoring.oomThreadHeap;

/*
Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection.
Properties:
1)They can not prevent the JVM from exiting when all the user threads finish their execution.
2)JVM terminates itself when all user threads finish their execution
3)If JVM finds running daemon thread, it terminates the thread and after that shutdown itself. JVM does not care whether Daemon thread is running or not.
4)It is an utmost low priority thread.
 */
public class IdleThread extends Thread{

    private Object task = null;

    public IdleThread() {
    }

    public void run() {
        waitForTask();
    }

    private synchronized void waitForTask() {
        try {
            wait();
        } catch (InterruptedException _ex) {

        }
    }

    public Object getTask() {
        return task;
    }

    public void setTask(Object task) {
        this.task = task;
    }
}
