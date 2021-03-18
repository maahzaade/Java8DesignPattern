package com.design.pattern.creational.singleton;


/*
The easier way to create a thread-safe singleton class is to make the global access method synchronized,
so that only one thread can execute this method at a time. General implementation of this approach is like the below class.
https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

}