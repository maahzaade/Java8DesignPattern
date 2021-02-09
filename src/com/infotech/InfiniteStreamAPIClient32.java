package com.infotech;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreamAPIClient32 {

    public static void main(String[] args) {

        Stream<Integer> iterate = Stream.iterate(0, i -> i + 2);
        List<Integer> collect = iterate.limit(10).collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Supplier<UUID> randomUIDs = UUID::randomUUID;
        Stream<UUID> generate = Stream.generate(randomUIDs);
        List<UUID> collects = generate.skip(10).limit(10).collect(Collectors.toList());

        collects.forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        Stream<Integer> iterated = Stream.iterate(0, i -> i + 1);
        iterated.limit(15).forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Stream<String> strings = Stream.generate(()->"elements").limit(10);
        strings.forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        IntStream range = IntStream.range(1,6);
        range.forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        IntStream range2 = IntStream.rangeClosed(1,6);
        range2.forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        Random random = new Random();
        DoubleStream doubles = random.doubles(5);
        doubles.forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        IntStream chars = "abcd".chars();
        chars.forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        Stream<String> streamOfStr= Pattern.compile(",").splitAsStream("a,b,c");
        streamOfStr.forEach(System.out::println);



    }
}
