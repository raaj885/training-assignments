package com.shristi.employee;

public class Employee {
    String name;
    String designation;

    Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    double calcBonus(double basicAllowance) {
        return  basicAllowance;
    }

    double calcBonus(double basicAllowance, double carAllowance) {
        return basicAllowance + carAllowance;
    }

    double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
        return  basicAllowance + carAllowance + houseAllowance;
    }
}
