package com.infotech;

import com.infotech.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionFunctionalInterfaceClient19B60 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList();

        Person personOne = new Person("Mahdiye", 40);
        people.add(personOne);

        Person personTwo = new Person("Mathieu", 48);
        people.add(personTwo);

        Person personThree = new Person("Adrian", 7);
        people.add(personThree);

        Person personFour = new Person("Alex", 1);
        people.add(personFour);

        for (Person item : people) {
            System.out.println(item.customShow(s -> "Name: " + s.getName() + "\t and Age: " + s.getAge()));
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        Function<Person, String> styleOne = s -> {
            String result = "Name: " + s.getName() + "\t and Age: " + s.getAge();
            return result;
        };

        for (Person item : people) {
            System.out.println(item.customShow(styleOne));
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        Function<Person, String> styleTwo = s -> "Name: " + s.getName() + "\t and Age: " + s.getAge();
        for (Person item : people) {
            System.out.println(item.customShow(styleTwo));
        }

    }
}
