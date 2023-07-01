package com.java8.features;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DateFind {
    public static void main(String[] args) {
        // Create a list of day
        List<LocalDate> day = new ArrayList<>();
        day.add(LocalDate.parse("2020-06-15"));
        day.add(LocalDate.parse("2021-06-25"));
        day.add(LocalDate.parse("2021-06-10"));
        day.add(LocalDate.parse("2023-06-15"));

        // Find the earliest date
        LocalDate earlydate = day.stream()
                .min(LocalDate::compareTo)
                .orElse(null);

        // Find the latest date
        LocalDate latestDate = day.stream()
                .max(LocalDate::compareTo)
                .orElse(null);

        // Print the earliest and latest day
        System.out.println("Earliest Date: " + earlydate);
        System.out.println("Latest Date: " + latestDate);
    }
}
