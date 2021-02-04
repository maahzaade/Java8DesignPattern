package com.infotech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntroductionClient26 {

    public static void main(String[] args) {
        String arr[] = new String[]{"AA", "BB", "CC", "DD", "EE", "FF", "GG"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        Stream<String> stream2 = Arrays.stream(arr,1,3);
        stream2.forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Stream<String> of = Stream.of("A", "B", "C", "D");
        of.forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");


        List<String> list = new ArrayList<>();
        list.add("Cat");
        list.add("Dog");
        list.add("Snake");
        list.add("Bird");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);
    }
}
