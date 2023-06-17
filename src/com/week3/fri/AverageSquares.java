package com.week3.fri;

public class AverageSquares {
    public static void main(String[] args) {
        int[] num= {2,6,7,9,8,10};
        int count=0;
        int sum=0;
        for (int number : num) {
            if (number % 2 != 0) { // Check if the number is odd
                int square = number * number;
                sum += square;
                count++;
            }
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of squares of odd numbers: " + average);
        } else {
            System.out.println("No odd numbers found in the array.");
        }
    }
}
