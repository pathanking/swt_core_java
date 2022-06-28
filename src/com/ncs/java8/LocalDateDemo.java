package com.ncs.java8;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(localDate.getChronology());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getEra());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.isLeapYear());

        ZoneId myZoneId = ZoneId.of("Asia/Manila");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(myZoneId);
        System.out.println(zonedDateTime);

        ZoneId myZoneId2 = ZoneId.of("Europe/Paris");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(myZoneId2);
        System.out.println(zonedDateTime2);

        ZoneId myZoneId3 = ZoneId.of("Asia/Calcutta");
        ZonedDateTime zonedDateTime3 = ZonedDateTime.now(myZoneId3);
        System.out.println(zonedDateTime3);
    }
}
