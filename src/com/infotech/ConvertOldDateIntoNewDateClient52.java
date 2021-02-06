package com.infotech;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class ConvertOldDateIntoNewDateClient52 {
    public static void main(String[] args) {

        Date date = new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println(localDateTime);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");


        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        Calendar calendar = Calendar.getInstance();
        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());
        System.out.println(localDateTime2);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");


    }
}
