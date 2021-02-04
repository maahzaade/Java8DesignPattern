package com.infotech;

import com.infotech.Implementation.SampleInterfaceImplementation;
import com.infotech.interfaces.SampleInterface;
import com.infotech.model.Student;

import java.util.ArrayList;
import java.util.List;

public class SampleStudentClient {

    public static void main(String[] args) {


        SampleInterface myInterface = new SampleInterfaceImplementation();

        List students = new ArrayList();

        Student studentOne = new Student("Mahdiye", 40);
        students.add(studentOne);

        Student studentTwo = new Student("Mathieu", 48);
        students.add(studentTwo);

        Student studentThree = new Student("Adrian", 7);
        students.add(studentThree);

        Student studentFour = new Student("Alex", 1);
        students.add(studentFour);

        myInterface.sortStudent(students);

        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++");


        students.forEach(s->System.out.println(s));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        students.forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        SampleInterface.greet("Sean");
    }
}
