package com.week1.day3;

interface A{
    void hi();


}
interface B{
    void bye();


}
class I1 implements A,B {

    @Override
    public void hi() {
        System.out.println("We use when we meet");
    }

    @Override
    public void bye() {
        System.out.println("We use when we leave");

    }
}
public class Main {
    public static void main(String[] args) {
        I1 c=new I1();
        c.hi();
        c.bye();

    }
}
