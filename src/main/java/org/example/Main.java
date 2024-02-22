package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hi welcome to calculator");

        }

    public int addition(int a ,int b){
        return a+b;
    }
    public int substration(int a,int b){
        return a-b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
    public int minimum(int a, int b) {
        return Math.min(a, b); // Minimum of a and b
    }
    public int maximum(int a, int b) {
        return Math.max(a, b); // Maximum of a and b
    }
    public int division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide number by zero");
        }
        return a / b; // Division of a by b
    }
    public int modulus(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Modulus by zero is undefined");
        }
        return a % b; // Remainder of a divided by b
    }
    public int power(int base, int exponent) {
        return (int) Math.pow(base, exponent); // power value
    }
    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result; //  Factorial number
    }
    public int absoluteValue(int num) {
        return Math.abs(num); // Absolute value of num
    }
    }
