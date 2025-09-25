package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // this version of this program currently only does multiplication
        // other operators will be added later
        System.out.println("Enter the first number: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = scanner.nextInt();
        //logic for operator input and calculation will go here
        String operatorString = "*";
        double result = n1 * n2;
        System.out.println(n1 + " " + operatorString + " " + n2 + " = " + result);
    }
}
