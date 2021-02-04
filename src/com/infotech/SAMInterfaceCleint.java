package com.infotech;

import com.infotech.interfaces.SAMInterface;

public class SAMInterfaceCleint {

    public static void main(String[] args) {
        SAMInterface samInterface = (name, age) -> {
            System.out.print("My name is: " + name);
            System.out.println("and I am " + age + " years old ");
        };

        samInterface.simplePrint("Mahdiye", 40);
    }
}
