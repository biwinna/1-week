package com.company.task3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main3 {
    public static void main(String[] args) throws Exception {
        Day day1 = Day.of(20, 20);
        System.out.println(day1);
        System.out.println(day1.format());
        System.out.println(day1.getTimesOfDay().getString());

        System.out.println();

        Day day2 = Day.now();
        System.out.println(day2);
        System.out.println(day2.format());
        System.out.println(day2.getTimesOfDay().getString());
    }
}
