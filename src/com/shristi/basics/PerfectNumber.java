package com.shristi.basics;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        int number,factor,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        number = sc.nextInt();
        sum=0;
        for (int i = 1; i < number; i++) {
            if(number%i==0) {
                factor=i;
                sum=sum+i;
            }
        }
        if(sum==number) {
            System.out.println("Its a perfect Number");
        }
        else {
            System.out.println("Its not a perfect number");
        }

    }

}

