package com.shristi.basics;

import java.util.Scanner;

public class SumAndAverageInArray {

    public static void main(String[] args) {
        int size ;
        float average, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");

        size = sc.nextInt();
        int []array= new int[100];
        System.out.println("Enter the numbers in array : ");
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            sum+=array[i];
        }

        System.out.println("Sum of numbers in array: "+(sum));
        average=(sum/size);
        System.out.println("Average of numbers in array"+(average));

    }

}
