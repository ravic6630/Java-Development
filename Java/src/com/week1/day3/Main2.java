package com.week1.day3;


class Parent{
    protected int var1;

    public Parent(int var1) {
        this.var1=var1;
    }
}
class Child extends Parent{

    protected int var2;

    public Child(int var1, int var2){
        super(var1);
        this.var2 =var2;
    }
    public Child(int var2){
        super(0);
        this.var2=var2;

    }
}
public class Main2 {
    public static void main(String[] args) {
        Parent p=new Parent(30);
        Child c=new Child(10,20 );
        Child c1=new Child(40);
        System.out.println(p.var1);
        System.out.println(c.var1 +" "+c.var2);
        System.out.println(c1.var2);


    }
}
