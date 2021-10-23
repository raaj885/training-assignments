package com.shristi.basics;

import java.util.Scanner;

public class CountOfDuplicatesInarray {
    public static void main(String[] args) {
        int size, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");

        size = sc.nextInt();
        int[] array = new int[100];
        System.out.println("Enter the numbers in array : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (array[i] == array[j]) {
                    count = count + 1;
                }
            }

        }
        System.out.println(count);


    }
}
