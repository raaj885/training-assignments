package com.shristi.student;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int inputLength;

        String name1;
        String studentId1;

        String name2;
        String studentId2;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter first student name :");
        name1 = input.nextLine();

        System.out.println("Enter first student id :");
        studentId1 = input.nextLine();

        System.out.println("Enter second student name :");
        name2 = input.nextLine();

        System.out.println("Enter second student id :");
        studentId2 = input.nextLine();

        System.out.println("Number of subjects for students");
        inputLength = input.nextInt();

        int[] marks1 = new int[inputLength];
        int[] marks2 = new int[inputLength];

        System.out.println("Enter student1 marks :");
        for (int i = 0; i < inputLength; i++) {
            marks1[i] = input.nextInt();
        }

        System.out.println("Enter student2 marks :");
        for (int i = 0; i < inputLength; i++) {
            marks2[i] = input.nextInt();
        }

        input.close();

        Student sneha = new Student(name1, studentId1);
        Student me = new Student(name2, studentId2);

        sneha.getDetails();
        sneha.getGrades(marks1);

        me.getDetails();
        me.getGrades(marks2);
    }
}
