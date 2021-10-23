package com.shristi.basics;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        int number1=0,number2=1,number3;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int maxNum = sc.nextInt();
        System.out.println("Fibonacci series : ");
        System.out.println(number1+"\n"+number2);

        for (int i=1;i<=maxNum;i++){
            number3=number1+number2;
            System.out.println(number3);
            number1=number2;
            number2=number3;

        }





    }
}
