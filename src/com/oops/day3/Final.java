package com.oops.day3;

final class Final {
    final int Speedlimit=75;


    final void speed(){
        System.out.println("Max Speed Limit is "+ Speedlimit);
    }

    public static void main(String[] args) {
        Final s=new Final();
        s.speed();
    }


}
