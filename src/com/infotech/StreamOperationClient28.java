package com.infotech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperationClient28 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sean");
        list.add("Martin");
        list.add("Frank");
        list.add("Andrew");

        Stream<String> stream = list.stream();
        Stream<String> distinct = stream.distinct();
        long count = distinct.count();
        System.out.println(count);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        System.out.println(list.stream().distinct().count());

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
//        System.out.println(stream.distinct().count());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");


        boolean anyMatch = list.stream().anyMatch(s->s.contains("ss"));
        System.out.println(anyMatch);

    }
}
