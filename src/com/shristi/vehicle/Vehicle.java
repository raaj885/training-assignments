package com.shristi.vehicle;

public class Vehicle {
    String name;
    String model;
    int price;

    Vehicle(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    void getdetails() {
        System.out.println("Vehicle name: " + name);
        System.out.println("Vehicle model: " + model);
        System.out.println("Vehicle price: " + price);
    }
}
