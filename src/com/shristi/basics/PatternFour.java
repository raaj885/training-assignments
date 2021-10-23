package com.shristi.basics;

import java.util.Scanner;

public class PatternFour {
    public static void main(String[] args) {
        //int ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        for (int i=1;i<=number;){
            for (int j=1;j<=number;j++){

                System.out.print("*"+" ");
            }
            number--;
            System.out.println("");
        }
    }
}
