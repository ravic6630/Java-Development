package com.week1.day1;

class Dog extends Animal {
    void bark(){
        System.out.println("Barking..");
    }

}
class BabyDog extends Dog{
    void weep(){
        System.out.println("Weeping");
    }

}
class Puppy extends Animal{
    void diet(){
        System.out.println("Attracting People");
    }
}
