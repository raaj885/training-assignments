package com.shristi.basics;

import java.util.Scanner;

public class ReversingOfNumberInArray {

    public static void main(String[] args) {
        int []array = new int[100];
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        size = sc.nextInt();


        System.out.println("Enter array numbers: ");
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Reversed Array");
        for (int i=(size-1);i>=0;i--){

            System.out.print(array[i]+" ");

        }



    }
}
