package com.infotech;

import com.infotech.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilterAndMatchAPIClient29 {
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


        Stream<Person> filteredList = people.stream().filter(p -> ((Person)p).getAge()>25);
        filteredList.forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Boolean allMatchList = people.stream().allMatch(p -> ((Person)p).getName().contains("M"));
        System.out.println("allMatchList++++++++++++++++++++++++++++++++++++++++"+ allMatchList);

        Boolean anyMatchList = people.stream().anyMatch(p -> ((Person)p).getName().contains("M"));
        System.out.println("anyMatchList++++++++++++++++++++++++++++++++++++++++"+ anyMatchList);

        Boolean noneMatchList = people.stream().noneMatch(p -> ((Person)p).getName().contains("S"));
        System.out.println("noneMatchList++++++++++++++++++++++++++++++++++++++++"+ noneMatchList);


    }

}
