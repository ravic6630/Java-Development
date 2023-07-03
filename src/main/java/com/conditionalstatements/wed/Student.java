package com.conditionalstatements.wed;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
//    private String gpa;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        this.gpa=gpa;
    }

    @Override
    public int compareTo(Student other) {
        return this.lastName.compareTo(other.lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
//                ", gpa='" + gpa + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        int index = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/ravichandrareddy/Desktop/prevdata.csv"))) {
            String line;
            while ((line = br.readLine()) != null && index < students.length) {
                String[] data = line.split(",");
                String firstName = data[0];
                String lastName = data[1];
                students[index] = new Student(firstName, lastName);
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort the data using bubble sort
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < students.length - 1; i++) {
                if (students[i].compareTo(students[i + 1]) > 0) {
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    sorted = false;
                }
            }
        } while (!sorted);

        // Print the sorted data
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
