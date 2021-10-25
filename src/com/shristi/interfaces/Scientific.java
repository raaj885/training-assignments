package com.shristi.interfaces;

public class Scientific extends Basic implements ScientificCalculator{

    public void cube(int x) {
        System.out.println("Cube :"+(x*x*x));
    }

    public void square(int x) {
        System.out.println("Square :"+(x*x));
    }

}
