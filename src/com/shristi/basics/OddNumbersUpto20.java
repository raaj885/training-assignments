package com.shristi.basics;

public class OddNumbersUpto20 {
    public static void main(String[] args) {
        System.out.println("Odd numbers upto 20 : \n");
        for (int i = 1; i <=20; i++) {
            if(i%2==0) {
                System.out.println(i-1);
            }

        }
    }
}
