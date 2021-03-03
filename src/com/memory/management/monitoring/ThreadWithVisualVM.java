package com.memory.management.monitoring;

import com.infotech.model.TraditionalThreadClass;

public class ThreadWithVisualVM {

    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            createThreadNotUsingLambda();
            createThreadUsingAnonymusClass();
            createThreadUsingLambdaExpression();
        }

    }

    private static void createThreadNotUsingLambda() {
        TraditionalThreadClass traditionalThreadClass = new TraditionalThreadClass();
        Thread threadTest = new Thread(traditionalThreadClass);
        threadTest.start();
    }

    private static void createThreadUsingLambdaExpression() {
        Runnable r = () -> System.out.println("My task is executing by createThreadUsingLambdaExpression()...");
        Thread thread = new Thread(r);
        thread.start();
    }

    private static void createThreadUsingAnonymusClass() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("My task is executing by createThreadUsingAnonymusClass()...");
            }
        };
        Thread thread = new Thread(r);
        thread.start();
    }
}
