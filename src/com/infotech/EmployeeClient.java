package com.infotech;

import com.infotech.model.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class EmployeeClient {

    public static void main(String[] args) {
        Map<Integer, Employee> map = new HashMap<>();

        map.put(19022, new Employee("Sean", "sean.m@gmail.com", 90000.00));
        map.put(19044, new Employee("Andrew", "andrew.a@gmail.com", 70000.00));
        map.put(19055, new Employee("Martin", "martin.a@gmail.com", 80000.00));

        Set<Map.Entry<Integer, Employee>> entrySet = map.entrySet();

        for (Map.Entry<Integer, Employee> entry : entrySet) {
            System.out.print("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.print("key--:" + key);
            System.out.println("value--:" + map.get(key));
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        map.forEach((k, v) -> System.out.println("*key: " + k + "*value:" + v));


        Map<Integer, String> biConMap = new HashMap<>();
        biConMap.put(1, "A");
        biConMap.put(2, "B");
        biConMap.put(3, "C");
        biConMap.put(4, "D");
        biConMap.put(5, "E");
        biConMap.put(6, "F");

        BiConsumer<Integer, String> biConsumer = (k, v) -> System.out.println("*key: " + k + "=====value:" + v);

        biConMap.forEach(biConsumer);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        BiConsumer<Integer, Integer> adder = (num1, num2) -> System.out.println("Adder: " + (num1 + num2));
        BiConsumer<Integer, Integer> multiplier = (num1, num2) -> System.out.println("Multiplier: " + (num1 * num2));

        adder.andThen(multiplier).accept(30, 20);
        multiplier.andThen(adder).accept(12, 10);
    }
}
