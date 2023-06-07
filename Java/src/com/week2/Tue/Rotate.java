package com.week2.Tue;

public class Rotate {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int n=3; // rotation number
        System.out.println("Given array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for(int i=0;i<n;i++){
            int j,f;
            f=a[0];// storing the first element of array

            for (j=0;j< a.length-1;j++){
                a[j]=a[j+1];


            }
            a[j]=f;// first element to be added in end of the array
        }
        System.out.println("Display after rotation");
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
