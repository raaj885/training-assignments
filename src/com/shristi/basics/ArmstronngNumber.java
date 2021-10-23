package com.shristi.basics;

import java.util.Scanner;
import java.lang.Math;

public class ArmstronngNumber {

    public static void main(String[] args) {
        int number, remainder = 1, modifiedNumber,count=0,temp1, temp2;
        double result=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        number = sc.nextInt();
        temp1=number;
        temp2=number;
        while (number != 0) {
            number=number/10;
            count=count+1;
        }

        while (temp1 != 0) {

            remainder = temp1 % 10;

            result = result + Math.pow(remainder, count);
            temp1 = temp1 / 10;
        }

        if(temp2==result) {
            System.out.println("Its an Armstrong Number");
        }
        else {
            System.out.println("Its not an Armstrong Number");
        }
        sc.close();

    }

}
