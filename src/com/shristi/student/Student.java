package com.shristi.student;

public class Student {
    String name;
    String studentId;

    Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    void getDetails() {
        System.out.println("Student name: " + name);
        System.out.println("Student studentId: " + studentId);
    }

    void getGrades(int [] marks) {
        int sum = 0;
        float average;
        String grade;

        for (int mark : marks) {
            sum += mark;
        }

        average = (float)sum / marks.length;

        if(average < 25) {
            grade = "C";
        } else if (average < 35) {
            grade = "B";
        } else {
            grade = "A";
        }

        System.out.println("Sum :" + sum);
        System.out.println("Average :" + average);
        System.out.println("Grade :" + grade);
    }
}
