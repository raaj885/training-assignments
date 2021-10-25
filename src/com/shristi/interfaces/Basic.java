package com.shristi.interfaces;

public class Basic implements BasicCalculator {

    public void add(int x, int y) {
        System.out.println("Addition is "+(x+y));

    }

    public void difference(int x, int y) {
        if(x>y){
            System.out.println("Difference is "+(x-y));
        }
        else{
            System.out.println("Difference is "+(y-x));
        }
    }

    public void product(int x, int y) {
        System.out.println("Product is" +(x*y));
    }

    public void divide(int x, int y) {
        if (y==0) {
            System.out.println("0");
        }
        else {
            System.out.println("Division is "+(x/y));
        }

    }
}
