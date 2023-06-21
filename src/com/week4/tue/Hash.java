package com.week4.tue;

import java.util.*;

public class Hash {
    public static void main(String[] args) {
        // Create a HashMap to store the students data
        HashMap<String, Student> studentMap = new HashMap<>();
    //Create Student objects
    Student student1 = new Student("Ravi Chandra", "Alathuru", 4.0);
    Student student2 = new Student("Deepika", "Tanna", 3.0);
    Student student3 = new Student("Charan", "Rayana", 3.7);


    // Add students to the HashMap
        studentMap.put(student1.getFirstName(), student1);
        studentMap.put(student2.getFirstName(), student2);
        studentMap.put(student3.getFirstName(), student3);


        // Entry Set
        System.out.println("return using Entry Set:");
        for (
        Map.Entry<String, Student> entry : studentMap.entrySet()) {
        String key = entry.getKey();
        Student student = entry.getValue();
        System.out.println("Key: " + key + ", Value: " + student);
             }

        // forEach method
        System.out.println("return using map's forEach method:");
        studentMap.forEach((key, student) -> System.out.println("Key: " + key + ", Value: " + student));

        // keySet and Iterator
        System.out.println("return using keySet and Iterator:");
    Iterator<String> iterator = studentMap.keySet().iterator();
        while (iterator.hasNext()) {
        String key = iterator.next();
        Student student = studentMap.get(key);
        System.out.println("Key: " + key + ", Value: " + student);
    }
}
}

class Student {
    private String fname;
    private String lname;
    private double GPA;

    public Student(String fname, String lname, double GPA) {
        this.fname = fname;
        this.lname = lname;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return fname;
    }

    public String getLastName() {
        return lname;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
