package com.shristi.basics;
import java.util.Scanner;
public class SortingArrayInAscending {
    public static void main(String[] args) {
        int size ,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");

        size = sc.nextInt();
        int []array= new int[100];
        System.out.println("Enter the numbers in array : ");
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Reverse of array : ");
        for (int k =0;k<size;k++) {

            System.out.println(array[k]);
        }


        sc.close();
    }
}
