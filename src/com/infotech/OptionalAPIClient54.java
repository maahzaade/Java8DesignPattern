package com.infotech;

import java.util.Optional;

public class OptionalAPIClient54 {

    public static void main(String[] args) {

        Integer value1 = null;
        Integer value2 = new Integer(10);
        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.ofNullable(value2);
        Integer sum = sum(a, b);
        System.out.println(sum);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

    }

    private static Integer sum(Optional<Integer> a, Optional<Integer> b) {
        System.out.println("First Parameter is: " + a.isPresent());
        System.out.println("Second Parameter is: " + b.isPresent());
        Integer value1 = a.orElse(new Integer(0));
        Integer value2 = b.get();

        return value1 + value2;
    }
}
