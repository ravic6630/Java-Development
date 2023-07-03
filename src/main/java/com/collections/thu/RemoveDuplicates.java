package com.collections.thu;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

    public class RemoveDuplicates {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a name: ");
            String name = sc.nextLine();
            sc.close();

            String result = removeDuplicates(name);
            System.out.println("after removing duplicates: " + result);
        }

        public static String removeDuplicates(String str) {
            // Create a LinkedHashSet to maintain order and store unique characters
            Set<Character> uniqueChars = new LinkedHashSet<>();

            // Iterate through each character in the string
            for (char c : str.toCharArray()) {
                uniqueChars.add(c);
            }

            // Build the resulting string from unique characters
            StringBuilder sb = new StringBuilder();
            for (char c : uniqueChars) {
                sb.append(c);
            }

            return sb.toString();
        }


    }
