package com.shristi.basics;

import java.util.Scanner;

public class PatternThree {
    public static void main(String[] args) {
        //int ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        for (int i=1;i<=number;i++){
            for (int j=1;j<=i;j++){

                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
}
