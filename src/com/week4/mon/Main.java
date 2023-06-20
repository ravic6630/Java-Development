package com.week4.mon;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            names.add("Tree" + i);
        //StringTraverse
        StringTraverse.stringTraverse(names);
         //RemoveLastElement
        RemoveLastElement.removeLastElement(names);
        //RemoveLessThanAvg
        RemoveLessThanAvg.removeLessThanAvgStudents();
        //ArrayListToArray
        ArrayListToArray.arrayListToArray(names);

    }
}
