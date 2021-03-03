package com.memory.management.monitoring;

import java.util.stream.Stream;

public class TestVisualVM {

    public static void main(String[] args) {

//        for (int i = 0; ; i++)
//            System.out.println("Hello World!");

//        Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 1);
//
//        infiniteStream.forEach(System.out::println);

        Stream<String> strings = Stream.generate(() -> "Hello World!!!!");
        strings.forEach(System.out::println);
    }

}
