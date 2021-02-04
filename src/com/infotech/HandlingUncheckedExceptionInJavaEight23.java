package com.infotech;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class HandlingUncheckedExceptionInJavaEight23 {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 9, 0, 6, 10, 20);


        try {
            integers.forEach(i -> System.out.println(50 / i));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred: " + e.getMessage());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        //See the difference of output of these four blocks of code
        integers.forEach(i -> {
            try {
                System.out.println(50 / i);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception Occurred: " + e.getMessage());
            }
        });
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        integers.forEach(lambdaWrapper(i -> System.out.println(50 / i)));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        integers.forEach(consumerWrapper(i -> System.out.println(50 / i), Exception.class));
    }

    public static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer) {
        return i -> {
            try {
                consumer.accept(i);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception Occurred: " + e.getMessage());
            }
        };
    }


    public static <T, E extends Exception> Consumer<T> consumerWrapper(Consumer<T> consumer, Class<E> exception) {
        return i -> {
            try {
                consumer.accept(i);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception Occurred: " + e.getMessage());
            }
        };
    }


}
