package com.infotech;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class HandlingCheckedExceptionInJavaEight25A {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 9, 0, 6, 10, 20);
        integers.forEach(i -> {
            try {
                writeToFile(i);
            } catch (Exception e) {
                throw new RuntimeException();
            }
        });
    }


    private static Object writeToFile(Integer i) throws IOException {
        return null;
    }
}
