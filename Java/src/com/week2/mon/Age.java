package com.week2.mon;

import java.util.*;

public class Age {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        if(age>=13 && age<=19){
            System.out.println("Teen");
        } else if (age<13 && age>1)
        {
            System.out.println("Kid");
        }
        else if (age > 19){
            System.out.println("Adult");
        }
        else {
            System.out.println("Invalid Age");
        }

    }
}
