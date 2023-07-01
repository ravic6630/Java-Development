package com.conditionalstatements.tue;
import java.util.*;

public class Reverse {
    public static void main(String[] argscd ) {
        int[] a={1,2,3,4,5,6,8};
        int i=0, j=a.length-1,temp;
        while (i<j){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(a));
    }
}
