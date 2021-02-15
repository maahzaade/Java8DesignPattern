package com.infotech;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class BinaryOperatorFunctionalInterfaceClient63 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("X","A");
        map.put("Y","B");
        map.put("Z","C");
        BinaryOperator<String> binaryOpr = (s1,s2) -> s1+"-"+s2;
        BinaryOperatorFunc(binaryOpr, map).forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

    }

    private static List<String> BinaryOperatorFunc(BinaryOperator<String> binaryOprator, Map<String, String> map) {
        List<String> biList = new ArrayList<>();
        map.forEach((s1,s2)-> {
            biList.add(binaryOprator.apply(s1, s2));
        });
        return null;
    }
}
