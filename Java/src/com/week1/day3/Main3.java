package com.week1.day3;



class MyClass {
    private static int var1;

    public static int getVar1() {
        return var1;
    }

    public static void setVar1(int value) {
        var1 = value;
    }

    static {

        var1 = initializeStaticVariable();
    }

    private static int initializeStaticVariable() {
       int initialValue=50;
        return initialValue;
    }
}

public class Main3 {
    public static void main(String[] args) {
        int value =MyClass.getVar1();
        System.out.println(value);

    }

}
