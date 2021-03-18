package com.test.sample.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> numberMapping = new HashMap<>();

        // Adding key-value pairs to a HashMap
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        numberMapping.putIfAbsent("Four", 4);
        numberMapping.put("Three", 5);
        numberMapping.put(null, 6);
        numberMapping.put("Seven", null);

        numberMapping.forEach((k, v) -> System.out.println("key: " + k + " ---------- value:" + v));
    }
}
