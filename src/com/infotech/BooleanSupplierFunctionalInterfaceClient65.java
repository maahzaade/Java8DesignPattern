package com.infotech;

import java.util.function.BooleanSupplier;

public class BooleanSupplierFunctionalInterfaceClient65 {

    public static void main(String[] args) {

        BooleanSupplier bs = () -> true;
        System.out.println(bs.getAsBoolean());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        int x = 100;
        int y = 70;
        bs = () -> x > y;
        System.out.println(bs.getAsBoolean());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        bs = () -> x < y;
        System.out.println(bs.getAsBoolean());

    }

}
