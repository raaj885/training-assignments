package com.shristi.basics;
import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[] args) {
        int number, factorial=1;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        number=sc.nextInt();

        for (int i = number; i>0;i--) {
            factorial=factorial*i;
        }
        System.out.println("Factorial of the number ");
        System.out.println(factorial);

        sc.close();

    }

}
