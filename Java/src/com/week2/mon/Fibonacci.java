package com.week2.mon;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n =sc.nextInt();
        int f=0, s=1, t;
        for(int i=2;i<n;i++){

            t=f+s;
            System.out.println(t);
            f=s;
            s=t;

        }
    }
}
