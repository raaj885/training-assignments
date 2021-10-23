package com.shristi.bank;

public class Main {
    public static void main(String[] args) {
        Bank axis = new Bank(67000);

        axis.deposit(3303);

        axis.withdraw(456);

        System.out.println(axis.getBalance());
    }
}
