package com.infotech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReductionCollectionAPIinStreamClient31 {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        Integer sum = integerList.stream().reduce(100, (x,y) -> x+y);
        System.out.println(sum);


        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        List<String> stringList = new ArrayList<>();
        stringList.add("dd");
        stringList.add("df");
        stringList.add("qq");

        List<String> str= stringList.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
        str.forEach(System.out::println);
    }
}
