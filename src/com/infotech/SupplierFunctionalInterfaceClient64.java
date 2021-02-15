package com.infotech;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunctionalInterfaceClient64 {

    public static void main(String[] args) {
        Supplier<Integer> supplier = SupplierFunctionalInterfaceClient64::getNum;
        for (int i = 0; i < 21; i++) {
            System.out.println(supplier.get());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

    }

    private static Integer getNum() {
        Random random = new Random();
        return random.nextInt(100);
    }

}
