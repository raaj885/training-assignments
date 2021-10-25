package com.shristi.interfaces;

public class Main {
    public static void main(String[] args) {
        Basic basic = new Basic();
        basic.add(12,6);
        basic.difference(12,6);
        basic.product(12,6);
        basic.divide(12,6);

        Scientific scientific = new Scientific();

        scientific.square(23);
        scientific.cube(21);
    }
}
