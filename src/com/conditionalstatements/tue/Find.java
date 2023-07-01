package com.conditionalstatements.tue;

public class Find {
    public static void main(String[] args) {

        int number[] = {-1, -4, 10, 15, 253};

        int largest = number[0];
        int smallest = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {

                largest = number[i];
            } else if (number[i] < smallest) {
                smallest = number[i];

            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}

