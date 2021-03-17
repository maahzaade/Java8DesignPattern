package com.test.sample.classcasting;

public class Driver {

    public static void main(String[] args){
        System.out.println("Upcasting-------");

         Parent parent = new Parent();

         Child child = new Child();

         child.print();

         parent = child;

         parent.print();
        ((Child) parent).draw();


        System.out.println("Downcasting-------");


        // impossible to do c = (Child)new Parent()
        Parent p = new Child();
        Child c = (Child) p;
        c.print();
        c.draw();

    }
}
