package com.infotech;

import com.infotech.model.Product;

import java.util.*;
import java.util.stream.Collectors;

public class StreamReductionDemoWithCollectClient40 {

    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(new Product(23, "potatoe"), new Product(13, "lemon"), new Product(23, "bread"), new Product(45, "sugar"));

        //Converting Stream to Collection
        List<String> strCollect1 = productList.stream().map(Product::getName).collect(Collectors.toList());
        strCollect1.forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        //Reduce to String
        String strCollect2 = productList.stream().map(Product::getName).collect(Collectors.joining(", ", "[", "]"));
        System.out.println(strCollect2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        //Reduce to String
        Double avgPrice = productList.stream().collect(Collectors.averagingInt(Product::getPrice));
        System.out.println(avgPrice);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");


        //Summarizing
        IntSummaryStatistics summaryStatistics = productList.stream().collect(Collectors.summarizingInt(Product::getPrice));
        //toString is already created in IntSummaryStatistics
        System.out.println(summaryStatistics);
        Map<Integer, List<Product>> groupByResult = productList.stream().collect(Collectors.groupingBy(Product::getPrice));

        groupByResult.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        //Dividing stream's elements into groups according to some predicate
        Map<Boolean, List<Product>> partitioned = productList.stream().collect(Collectors.partitioningBy((Product p) -> (((Product) p).getPrice() > 15)));
        partitioned.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        //Publishing the collector to perform additional transformation
        Set<Product> transformedDataStructure = productList.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
        transformedDataStructure.forEach(System.out::println);

    }
}
