package com.infotech;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormattingClient53 {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 5, 6, 30);
        System.out.println(localDateTime);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        String isoFormat = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(isoFormat);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        String PatternFormatted = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(PatternFormatted);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        String anotherPatternFormatted = localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.UK));
        System.out.println(anotherPatternFormatted);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
    }
}
