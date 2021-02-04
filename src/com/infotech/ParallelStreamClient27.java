package com.infotech;

import com.infotech.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamClient27 {

    public static void main(String[] args) {
        List people = new ArrayList();

        Person personOne = new Person("Mahdiye", 40);
        people.add(personOne);

        Person personTwo = new Person("Mathieu", 48);
        people.add(personTwo);

        Person personThree = new Person("Adrian", 7);
        people.add(personThree);

        Person personFour = new Person("Alex", 1);
        people.add(personFour);

        Person personFive = new Person("Victoria", 3);
        people.add(personFive);

        Person personSix = new Person("Emad", 2);
        people.add(personSix);

        Person personSeven = new Person("Arastoo", 5);
        people.add(personSeven);

        Stream<Person> parallelStream = people.parallelStream();
        System.out.println("Student's data sent for processing..");
        parallelStream.forEach(s->doProcess(s));
    }

    private static void doProcess(Person s) {
        System.out.println(s);
    }
}
