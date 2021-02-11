package com.infotech;

import java.util.function.BiFunction;

public class BiFunctionClient59 {

    public static void main(String[] args) {
        BiFunction<Integer,Integer, String> biFunction = (num1, num2)-> "The Result is: "+(num1+num2);
        System.out.println(biFunction.apply(100, 40));
    }

}
