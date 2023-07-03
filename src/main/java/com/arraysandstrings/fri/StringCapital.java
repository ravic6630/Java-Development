package com.arraysandstrings.fri;

import java.util.Arrays;

public class StringCapital {
    public static void main(String[] args) {
        String[] nolan = {"oppenheimmer", "interstellar", "dunkirk", "prestige" , "inception" , "Tenet"};

        // Capitalize the first letter of each string
        for (int i = 0; i < nolan.length; i++) {
              String os = nolan[i]; // Original String
            String cs = os.substring(0, 1).toUpperCase() + os.substring(1); // Capitalized String
            nolan[i] = cs;
        }

        // Sort the nolan in alphabetical order
        Arrays.sort(nolan);

        // Print the capitalized nolan in alphabetical order
        for (String string : nolan) {
            System.out.println(string);
        }
    }
}
