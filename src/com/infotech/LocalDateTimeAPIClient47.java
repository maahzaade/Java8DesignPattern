package com.infotech;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeAPIClient47 {

    public static void main(String[] args) {

        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        LocalDateTime localDateTime3 = LocalDateTime.parse("2021-02-10T14:26:45");
        System.out.println(localDateTime3);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        LocalDate localDate4 = localDateTime3.toLocalDate();
        System.out.println(localDate4);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        LocalTime localTime4 = localDateTime3.toLocalTime();
        System.out.println(localTime4);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");


        System.out.println("++++++++++++++++++++++++++++++++++++++++"+LocalDateTime.MAX);
        System.out.println("++++++++++++++++++++++++++++++++++++++++"+LocalDateTime.MIN);
    }
}
