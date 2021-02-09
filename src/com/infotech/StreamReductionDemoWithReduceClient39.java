package com.infotech;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReductionDemoWithReduceClient39 {

    public static void main(String[] args) {
        //1+2+3
        OptionalInt reduced = IntStream.range(1, 4).reduce((a, b) -> a + b);
        System.out.println(reduced.getAsInt());

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        //10+1+2+3
        int reduced2 = IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
        System.out.println(reduced2);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        Integer reduced3 = Arrays.asList(1, 2, 3).parallelStream().reduce(10, (a, b) -> a + b, (a, b) -> {
            System.out.println("Inside Combiner .."+a+".."+b);
            return a + b;
        });
        //11, 12, 13
        //11, 12+13, 25+11
        System.out.println(reduced3);
    }
}
