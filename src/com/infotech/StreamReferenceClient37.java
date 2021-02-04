package com.infotech;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReferenceClient37 {
    public static void main(String[] args) {
//      List<String> reference = Stream.of("AA", "BB", "CC", "DD", "EE", "FF", "GG").filter(e->e.contains("BB")).collect(Collectors.toList());
        List<String> reference = Stream.of("AA", "BB", "CC", "DD", "EE", "FF", "GG").collect(Collectors.toList());
        Optional<String> findAny = reference.stream().findAny();
        System.out.println(findAny.get());


        Optional<String> findFirst = reference.stream().findFirst();
        System.out.println(findFirst.get());


    }
}
