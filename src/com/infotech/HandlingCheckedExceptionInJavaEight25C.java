package com.infotech;

import com.infotech.interfaces.ThrowingConsumer;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class HandlingCheckedExceptionInJavaEight25C {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 9, 0, 6, 10, 20);
        integers.forEach(handleConsumerWrapper(i -> writeToFile(i), IOException.class));

    }

    private static Object writeToFile(Integer i) {
        return null;
    }

    private static <T, E extends Exception> Consumer<T> handleConsumerWrapper(ThrowingConsumer<T, Exception> throwingConsumer, Class<E> exceptionClass) {
        return i -> {
            try {
                throwingConsumer.accept(i);
            } catch (Exception ex) {

                try {
                    E exception = exceptionClass.cast(ex);
                    System.err.println("Exception Occurred: " + exception.getMessage());
                } catch (ClassCastException cce) {
                    throw new RuntimeException();
                }
            }
        };
    }
}
