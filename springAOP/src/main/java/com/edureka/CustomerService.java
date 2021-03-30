package com.edureka;/*
 * Created by Mahdiye on 2021, Mar, 27
 */

public class CustomerService {

    private String name;
    private String url;

    public void printName() {
        System.out.println("Customer name : " + this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printUrl() {
        System.out.println("Customer website : " + this.url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void printThrowException() {
        throw new IllegalArgumentException();
    }
}
