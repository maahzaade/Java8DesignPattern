package com.infotech;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MethodReferenceStaticMethodClient17 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
//      Runnable command = () -> System.out.println("My Task is running");
        Runnable command = (MethodReferenceStaticMethodClient17::myRun);
        executorService.execute(command);
    }

    private static void myRun() {
        System.out.println("My Task is running");
    }
}
