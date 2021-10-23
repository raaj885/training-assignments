package com.shristi.employee;

public class OverloadMain {
        public static void main(String[] args) {
            Employee arun = new Employee("James", "Manager");
            Employee snehangshu = new Employee("Rajesh", "Programmer");
            Employee raj = new Employee("Sam", "Director");

            System.out.println(snehangshu.calcBonus(76789));
            System.out.println(arun.calcBonus(76689, 873));
            System.out.println(raj.calcBonus(76789, 2344, 9000));
        }
    }

