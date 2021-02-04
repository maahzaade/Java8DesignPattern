package com.infotech;

import java.util.stream.Stream;

public class StreamIntroductionBuilderClient34 {

    public static void main(String[] args) {
//      Stream<Object> build = Stream.builder().add("kk").add("PK").add("MK").add(20).build();
        Stream<String> build = Stream.<String>builder().add("kk").add("PK").add("MK").build();
        build.forEach(System.out::println);
    }
}
