package com.infotech.model;

import java.util.function.Function;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


    public String customShow(Function<Person, String> function) {
        return function.apply(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
