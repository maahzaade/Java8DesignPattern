package com.test.sample.iterator;

public class IteratorDriver {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        CustomArray customArray = new CustomArray(numbers);

        customArray.forEach(System.out::println);

    }
}
