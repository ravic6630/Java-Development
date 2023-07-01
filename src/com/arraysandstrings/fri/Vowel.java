package com.arraysandstrings.fri;

public class Vowel {
    public static void main(String[] args) {
        String[] dirc = {"Christopher Nolan","Martin Scorcese" , "Quentin Tarentino"};
        for (String string : dirc) {
            int vowelCount = 0;
            StringBuilder vowels = new StringBuilder();

            // Check each character of the string for vowels
            for (char c : string.toCharArray()) {
                if (isVowel(c)) {
                    vowelCount++;
                    vowels.append(c);
                }
            }

            // Print the string and the number of vowels
            if (vowelCount > 0) {
                System.out.println("String: " + string);
                System.out.println("No of Vowels: " + vowelCount);
                System.out.println("Vowels: " + vowels.toString());
                System.out.println();
            }
        }
    }
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
