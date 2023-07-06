package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.spring");
        context.refresh();

        Person person = context.getBean(Person.class);
        person.getAccount().print();
        System.out.println("Person: " + person);
        System.out.println("Address: " + person.getAddress());
        System.out.println("Account: " + person.getAccount());

        context.close();
    }
}
