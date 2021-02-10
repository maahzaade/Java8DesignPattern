package com.infotech.model;

public class TraditionalThreadClass implements Runnable {
    @Override
    public void run() {
        System.out.println("My task is executing by TraditionalThreadClass...");
    }
}
