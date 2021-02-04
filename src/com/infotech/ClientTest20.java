package com.infotech;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ClientTest20 {

    public static void main(String[] args) {


        List<String> nameList = new ArrayList<>();
        nameList.add("Andrew");
        nameList.add("Sean");
        nameList.add("Rocky");

        nameList.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });

        nameList.forEach((name) -> {
            System.out.println(name);
        });
        nameList.forEach(System.out::println);

    }

}
