package com.shristi.abstraction;


import java.util.Scanner;

public class ATMMain {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account type");
        System.out.println("For Savings Account Press 1, For Current account press 2");
        System.out.println();
        String accountType = sc.next();
        Bank bank=null;

        if (accountType.equals("1")) {

            bank=new Savings(100);
            System.out.println("Select the operation to");
            System.out.println("press 1 for Deposit amount");
            System.out.println("press 2 for Withdraw amount");
            System.out.println("Press 3 for Balance details");
            System.out.println();
            String input = sc.next();

            switch (input) {
                case "1":
                    System.out.println("Enter the amount to Deposit");
                    int depositAmount = sc.nextInt();
                    bank.deposit(depositAmount);
                    break;
                case "2":
                    System.out.println("Enter the amount to Withdraw");
                    int withdrawAmount = sc.nextInt();
                    bank.withdraw(withdrawAmount);
                    break;
                case "3":
                    System.out.println();
                    bank.getBalance();
            }

        }
        if (accountType.equals("2")) {

            bank=new Current(500);
            System.out.println("Select the operation to");
            System.out.println("press 1 for Deposit amount");
            System.out.println("press 2 for Withdraw amount");
            System.out.println("Press 3 for Balance details");
            System.out.println();
            String input = sc.next();

            switch (input) {
                case "1":
                    System.out.println("Enter the amount to Deposit");
                    int depositAmount = sc.nextInt();
                    bank.deposit(depositAmount);
                    break;
                case "2":
                    System.out.println("Enter the amount to Withdraw");
                    int withdrawAmount = sc.nextInt();
                    bank.withdraw(withdrawAmount);
                    break;
                case "3":
                    System.out.println();
                    bank.getBalance();
            }

        }
        sc.close();

    }
}
