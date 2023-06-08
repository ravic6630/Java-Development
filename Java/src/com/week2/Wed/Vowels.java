package com.week2.Wed;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        int c=0; //count
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String word = sc.nextLine();

       for (int i=0; i< word.length(); i++){
           char ch= word.charAt(i);
          if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
              c++;
           }


        }
        System.out.println( "No of vowels "+ c);
    }
}
