package com.week4.thu;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();

        // Add 10 strings to the HashSet
        name.add("Ravi");
        name.add("Chandra");
        name.add("Alathuru");
        name.add("Manasa");
        name.add("Mallela");
        name.add("Charan");
        name.add("Rayana");
        name.add("Strin8");
        name.add("String9");
        name.add("String10");

        System.out.println("using Iterator:");
        Iterator<String> iterator = name.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println("\nusing ForEach loop:");
        for (String element : name) {
            System.out.println(element);
        }

        System.out.println("\nusing Streams forEach:");
        name.stream().forEach(System.out::println);
    }
}
