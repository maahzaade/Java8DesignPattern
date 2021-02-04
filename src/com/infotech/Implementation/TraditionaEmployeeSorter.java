package com.infotech.Implementation;

import com.infotech.model.Employee;

import java.util.Comparator;

public class TraditionaEmployeeSorter implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
