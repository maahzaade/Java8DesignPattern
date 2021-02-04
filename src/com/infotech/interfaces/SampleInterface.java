package com.infotech.interfaces;

import com.infotech.model.Student;

import java.util.Collections;
import java.util.List;

@FunctionalInterface
public interface SampleInterface {

    default public List<Student> sortStudent(List<Student> stuList){
        Collections.sort(stuList);

        return stuList;
    }

    public static void greet(String name){
        System.out.println("Welcome: "+name);
    }

    public abstract Integer getMinName(List<Integer> intList);



}
