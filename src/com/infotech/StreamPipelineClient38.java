package com.infotech;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineClient38 {
    public static void main(String[] args) {
        Stream<String> listStream0 = Stream.of("AA", "BB", "CC", "DD", "EE", "FF", "GG").skip(1);
        listStream0.forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Stream<String> listStream1 = Stream.of("abc", "abc4", "xyziuo", "werui", "hjuui", "wewiu", "sfdf");
        Stream<String> streamList = listStream1.skip(1).map(element -> element.substring(0,3));
        streamList.forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        List<String> listStream2 = Arrays.asList("abc1", "abc2", "abc3", "abc4", "abc5", "abc6", "abc7");
        long size = listStream2.stream().skip(1).map(element -> element.substring(0,3)).sorted().count();
        System.out.println(size);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

    }
}
