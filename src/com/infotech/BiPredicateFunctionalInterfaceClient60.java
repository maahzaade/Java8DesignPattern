package com.infotech;

import java.util.function.BiPredicate;

public class BiPredicateFunctionalInterfaceClient60 {
    public static void main(String[] args) {
        BiPredicate<Integer, String> biPredicate = (n, s) -> n > 20 && s.startsWith("M");
        System.out.println(biPredicate.test(30, "Mahdiye"));
        System.out.println(biPredicate.test(4, "Adrian"));
    }
}
