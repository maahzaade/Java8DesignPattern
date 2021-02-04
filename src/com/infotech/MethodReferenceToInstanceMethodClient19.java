package com.infotech;

import com.infotech.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceToInstanceMethodClient19 {

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


        List<String> peopleNames = MethodReferenceToInstanceMethodClient19.getPeoplenames(people, Person::getName);
        peopleNames.forEach(System.out::println);

    }

    private static List<String> getPeoplenames(List people, Function<Person, String> f) {
        List<String> peopleNames = new ArrayList<>();
        people.forEach(x -> peopleNames.add(f.apply((Person) x)));
        return peopleNames;
    }

}
