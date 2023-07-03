package com.java8.features;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        // Assuming the birthdate is in the format: yyyy-MM-dd
        String birthdateStr = "1995-05-15";

        // Parse the birthdate string to LocalDate
        LocalDate birthdate = LocalDate.parse(birthdateStr);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the age using the Period class
        Period age = Period.between(birthdate, currentDate);

        // Print the age
        System.out.println("Age: " + age.getYears() + " years");
    }
}
