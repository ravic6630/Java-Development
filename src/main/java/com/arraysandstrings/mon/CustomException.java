package com.arraysandstrings.mon;
class CE1 extends RuntimeException{
    CE1(String s){
        super(s);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int x;
        try{
            x= 10/0;
            System.out.println(x);
        }catch(RuntimeException e){
            throw new CE1("This is our customized Exception");
        }

    }



}