package com.java8.features;

import java.util.Optional;

public class Uppercase {
    public static Optional<String> toUpperCase(Optional<String> input) {
        if (input.isPresent()) {
            String uppercaseString = input.get().toUpperCase();
            return Optional.of(uppercaseString);
        } else {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        Optional<String> str = Optional.of("ravi chandra reddy");
        Optional<String> result1 = toUpperCase(str);
        if (result1.isPresent()) {
            System.out.println("Uppercase string 1: " + result1.get());
        } else {
            System.out.println("Optional string  is empty.");
        }

    }
}
