package com.week4.mon;

import java.util.*;


public class RemoveLessThanAvg {
    public static void removeLessThanAvgStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ravi Chandra", " Alathuru", 4.0));
        students.add(new Student("Manasa", "Mallela", 3.9));
        students.add(new Student("Charan", "Rayana", 3.9));
        students.add(new Student("Surya Teja", "Ambakam", 3.7));
        students.add(new Student("Deepika", "Tanna", 3.3));

        double sum = 0;
        for (Student student : students) {
            sum += student.getGpa();
        }

        double average = sum / students.size();

        System.out.println("All students" + students);

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getGpa() < average) {
                iterator.remove();
            }
        }
        System.out.println("Student with above Average GPA");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
