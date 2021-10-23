package com.shristi.basics;

import java.util.Scanner;

public class PatternTwo {
    public static void main(String[] args) {
        int number=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){

                System.out.print(number+" ");
                number=number+1;

            }
            System.out.println("");
        }
    }
}
