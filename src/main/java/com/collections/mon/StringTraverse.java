package com.collections.mon;

import java.util.ArrayList;
import java.util.Iterator;

public class StringTraverse {

    public static void stringTraverse(ArrayList<String> input) {

        System.out.println("using for loop");
        for (int i = 0; i < 10; i++)
            System.out.println(input.get(i));

        System.out.println("using enhanced for loop");
        for (String s : input)
            System.out.println(s);

        System.out.println("using Iterator");
        Iterator<String> inputItr = input.iterator();
        while (inputItr.hasNext()) {
            String name = inputItr.next();
            System.out.println(name);
        }

        System.out.println("using forEach");
        input.forEach(s -> System.out.println(s));

        System.out.println("using parallel stream");
        input.parallelStream().forEach(System.out::println);
    }
}
