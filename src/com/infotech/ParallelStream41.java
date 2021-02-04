package com.infotech;

import com.infotech.model.Product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream41 {

    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(new Product(23, "potatoe"), new Product(13, "lemon"), new Product(23, "bread"), new Product(45, "sugar"));

        //Creating ParallelStream out of Collection
        Stream<Product> streamOfCollection = productList.parallelStream();
        boolean isParallel = streamOfCollection.isParallel();
        System.out.println(isParallel);
        boolean bigPrice = streamOfCollection.map(product -> product.getPrice() * 12).anyMatch(price -> price > 200);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println(bigPrice);

        //Creating ParallelStream out of IntStream, LongStream and DoubleStream
        IntStream intStreamParallel = IntStream.range(1, 150).parallel();
        boolean isParallel2 = intStreamParallel.isParallel();
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println(isParallel2);

        //Converting ParallelStream to sequential mode
        IntStream intStreamSequential = intStreamParallel.sequential();
        boolean isParallel3 = intStreamSequential.isParallel();
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println(isParallel3);
    }
}
