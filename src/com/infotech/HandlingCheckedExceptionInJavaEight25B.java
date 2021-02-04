package com.infotech;

import com.infotech.interfaces.ThrowingConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class HandlingCheckedExceptionInJavaEight25B {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 9, 0, 6, 10, 20);
        integers.forEach(throwsConsumerWrapper(i -> writeToFile(i)));

    }

    private static Object writeToFile(Integer i) {
        return null;
    }

    private static <T> Consumer<T> throwsConsumerWrapper(ThrowingConsumer<T, Exception> throwingConsumer) {
        return i -> {
            try {
                throwingConsumer.accept(i);
            } catch (Exception ex) {
                throw new RuntimeException();
            }
        };
    }
}
