package com.infotech;

import java.time.*;
import java.util.Set;

public class ZonedDateTimeClient49 {

    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        Set<String> availableZoneId = zoneId.getAvailableZoneIds();
        availableZoneId.forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        //convert local date time to specific time Zone
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        System.out.println(zonedDateTime);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");


        //Zone Offset
        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);
        System.out.println(offsetDateTime);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }
}
