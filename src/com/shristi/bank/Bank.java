package com.shristi.bank;

public class Bank {
    double balance;

    Bank(double balance) {
        this.balance = balance;
    }

    public void withdraw(int x) {
        balance -= x;
    }

    public void deposit(int x) {
        balance += x;
    }

    public double getBalance() {
        return balance;
    }
}
