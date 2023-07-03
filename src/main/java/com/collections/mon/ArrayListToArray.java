package com.collections.mon;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void arrayListToArray(ArrayList<String> input){
        System.out.println("Input Class : " + input.getClass());
        String[] array = input.toArray(new String[input.size()]);
        System.out.println("Output Class : " + array.getClass());
    }
}
