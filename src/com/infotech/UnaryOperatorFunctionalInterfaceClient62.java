package com.infotech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorFunctionalInterfaceClient62 {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(2, 4, 6, 8, 10, 12);
        UnaryOperator<Integer> unaryOperator = i->i*i;
        unaryOperatorFun(unaryOperator, integers).forEach(System.out::println);


    }

    private static List<Integer> unaryOperatorFun(UnaryOperator<Integer> unaryOperator, List<Integer> integers) {
        List<Integer> uniList = new ArrayList<>();
        integers.forEach(i->uniList.add(unaryOperator.apply(i)));
        return uniList;
    }
}
