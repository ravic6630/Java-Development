package com.week4.mon;

import java.util.ArrayList;

public class RemoveLastElement {
    public static void removeLastElement(ArrayList<String> input){

        if (!input.isEmpty()) {
            input.remove(input.size() - 1);
        }
        System.out.println("\nUpdated Array List after removing last element : " + input);
    }
}
