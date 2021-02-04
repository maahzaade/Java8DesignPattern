package com.infotech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceConstructorClient18 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 9, 36, 100);
        numbers.forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        List<Double> findSquareRoots = MethodReferenceConstructorClient18.findSquareRoots(numbers, Integer::new);
        findSquareRoots.forEach(System.out::println);

//        I have an issue here with apply
//        System.out.println("++++++++++++++++++++++++++++++++++++++++");
//
//        List<Integer> ints = Arrays.asList(4, 9, 36, 100);
//        ints.forEach(System.out::println);
//        List<Boolean> testBools = MethodReferenceConstructorClient18.findFunctionNature(ints, Integer::new);
//        testBools.forEach(System.out::println);
    }


    private static List<Double> findSquareRoots(List<Integer> numbers, Function<Integer, Integer> f) {
        List<Double> results = new ArrayList<>();
        numbers.forEach(x -> results.add(Math.sqrt(f.apply(x))));
        return results;
    }


//    private static List<Boolean> findFunctionNature(List<Integer> ints, Function<Integer, Boolean> f) {
//        List<Boolean> results = new ArrayList<>();
//        ints.forEach(x -> results.add(f.apply(x)));
//        return results;
//    }
}
