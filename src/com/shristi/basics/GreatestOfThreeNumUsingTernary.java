package com.shristi.basics;

public class GreatestOfThreeNumUsingTernary {
    public static void main(String[] args) {
        int firstNumber = 324;
        int secondNumber=789;
        int thirdNumber= 342;

        int greatestNumber = (firstNumber > secondNumber) ? (firstNumber > thirdNumber ? firstNumber : thirdNumber) : (secondNumber > thirdNumber ? secondNumber : thirdNumber);

        System.out.println("Greatest number : "+greatestNumber);
    }
}
