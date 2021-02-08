package com.infotech;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateAPIClient45 {

    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        Clock clock = Clock.systemDefaultZone();
        LocalDate loclDate2 = LocalDate.now(clock);
        System.out.println(loclDate2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        LocalDate loclDate3 = LocalDate.now(zoneId);
        System.out.println(loclDate3);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        LocalDate loclDate4 = LocalDate.of(2017, 03, 02);
        System.out.println(loclDate4);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        LocalDate loclDate5 = LocalDate.parse("1980-07-12");
        System.out.println(loclDate5);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        LocalDate loclDate6 = loclDate5.plusDays(2);
        System.out.println(loclDate6);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        LocalDate loclDate7 = loclDate5.minus(2, ChronoUnit.DAYS);
        System.out.println(loclDate7);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");


        DayOfWeek dayOfWeek = LocalDate.parse("2021-02-03").getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        int dayOfMonth = LocalDate.parse("2021-02-03").getDayOfMonth();
        System.out.println(dayOfMonth);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        LocalDate thisYear = LocalDate.now();
        System.out.println(thisYear.isLeapYear());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        LocalDate previousYear = LocalDate.now().minusYears(1);
        System.out.println(previousYear.isLeapYear());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        boolean isBefore = LocalDate.parse("1980-07-12").isBefore(LocalDate.parse("1980-07-13"));
        System.out.println(isBefore);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        boolean isAfter = LocalDate.parse("1980-07-12").isAfter(LocalDate.parse("1980-07-13"));
        System.out.println(isAfter);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        LocalDateTime atStart = LocalDate.parse("1980-07-12").atStartOfDay();
        System.out.println(atStart);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");


        LocalDate with = LocalDate.parse("1980-07-12").with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(with);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");


        LocalDate finalDate = localDate1.plus(Period.ofDays(5));
        int days = Period.between(localDate1, finalDate).getDays();
        System.out.println(days);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");


        long between = ChronoUnit.DAYS.between(localDate1, finalDate);
        System.out.println(between);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

    }
}
