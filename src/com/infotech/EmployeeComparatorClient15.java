package com.infotech;

import com.infotech.Implementation.TraditionaEmployeeSorter;
import com.infotech.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparatorClient15 {
    public static void main(String[] args) {
        List employees = new ArrayList();

        employees.add(new Employee("Sean", "sean.m@gmail.com", 90000.00));
        employees.add(new Employee("Andrew", "andrew.a@gmail.com", 70000.00));
        employees.add(new Employee("Martin", "martin.a@gmail.com", 80000.00));


        System.out.println("Employees before sorting:");
        employees.forEach(System.out::println);


        Collections.sort(employees, new TraditionaEmployeeSorter());

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Employees after sorting by name:");
        employees.forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Collections.sort(employees, new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEmail().compareTo(o2.getEmail());
            }
        });

        System.out.println("Employees after sorting by email:");
        employees.forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Collections.sort(employees, (Employee o1, Employee o2) -> {
                    if (o1.getSalary() < o2.getSalary())
                        return 1;
                    else if (o1.getSalary() > o2.getSalary())
                        return -1;
                    else
                        return 0;
                }
        );

        System.out.println("Employees after sorting by salary in descending order:");
        employees.forEach(System.out::println);

    }
}
