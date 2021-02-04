package com.infotech;

import com.infotech.model.TraditionalThreadClass;

public class ThreadClient {


    public static void main(String[] args) {

        createThreadNotUsingLambda();
        createThreadUsingAnonymusClass();
        createThreadUsingLambdaExpression();

    }

    private static void createThreadNotUsingLambda() {
        TraditionalThreadClass traditionalThreadClass = new TraditionalThreadClass();
        Thread threadTest = new Thread(traditionalThreadClass);
        threadTest.start();
    }

    private static void createThreadUsingLambdaExpression() {
        Runnable r = () -> System.out.println("My task is executing..");
        Thread thread = new Thread(r);
        thread.start();
    }

    private static void createThreadUsingAnonymusClass() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("My task is executing..");
            }
        };
        Thread thread = new Thread(r);
        thread.start();
    }
}
