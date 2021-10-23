package com.shristi.basics;

import java.util.Scanner;

public class ReverseOfNumbers {
    public static void main(String[] args) {
        int reverse=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        while(number!=0){
            int r=number%10;
            reverse=(reverse*10)+r;
            number=number/10;
        }
        System.out.println(reverse);








    }
}
