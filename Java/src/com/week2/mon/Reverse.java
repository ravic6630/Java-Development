package com.week2.mon;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int rev = 0;
        while(num != 0) {

            int value  = num % 10;
            rev = rev * 10 + value;
            num /= 10; // num=num/10

        }
        System.out.println("reversed number " + rev);
    }
}
