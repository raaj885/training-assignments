package com.shristi.basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        for (int i=2;i<number;i++){
            if(number%i==0){
                count+=1;
            }
        }
        if (count==0){
            System.out.println("Its a prime number");
        }
        else{
            System.out.println("Its not a prime number");
        }


    }
}
