package com.java8.features;

import java.util.Optional;

public class Stringlength {
    public static Optional<Integer> getStringLength(String input) {
        if (input == null) {
            return Optional.empty();
        } else {
            int length = input.length();
            return Optional.of(length);
        }
    }

    public static void main(String[] args) {
        String str ="Ravi Chandra Reddy" ;
        Optional<Integer> l1 = getStringLength(str);
        if (l1.isPresent()) {
            System.out.println("Length of str: " + l1.get());
        } else {
            System.out.println("Empty String");
        }
    }
}

