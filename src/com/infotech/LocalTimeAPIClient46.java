package com.infotech;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeAPIClient46 {

    public static void main(String[] args) {

        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime1);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        LocalTime localTime2 = LocalTime.parse("09:30");
        System.out.println(localTime2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        LocalTime localTime3 = LocalTime.of(10,45);
        System.out.println(localTime3);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        LocalTime localTime4 = localTime3.plus(2, ChronoUnit.HOURS);
        System.out.println(localTime4);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        boolean isBefore = LocalTime.parse("09:30").isBefore(LocalTime.parse("19:30"));
        System.out.println(isBefore);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");


        System.out.println("++++++++++++++++++++++++++++++++++++++++"+LocalTime.MAX);
        System.out.println("++++++++++++++++++++++++++++++++++++++++"+LocalTime.MIN);


        LocalTime localTime5 = LocalTime.of(6,30, 0);
        LocalTime localTime6  = localTime5.plus(Duration.ofSeconds(30));
        System.out.println(Duration.between(localTime5, localTime6).getSeconds());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");


        long between  = ChronoUnit.SECONDS.between(localTime5, localTime6);
        System.out.println(between);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }
}
