package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the integer-specific calculator (with a decimal result).");
        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();
        System.out.print("""
                Possible calculations:
                (A)dd
                (S)ubtract
                (M)ultiply
                (D)ivide
                Please select an option:\s""");
        scanner.nextLine();  // consume the leftover newline, we need this because of calling
                             // nextline after nextint, scanner is not facing the next line
        String operatorInput = scanner.nextLine().toUpperCase(); //string to hold user input
        double result;
        String operatorString = ""; //string to hold operator to be printed in result expression
        switch (operatorInput) { //switch will use String.equals which is wanted
            case "A":
                result = n1 + n2;
                operatorString = "+";
                break;
            case "S":
                result = n1 - n2;
                operatorString = "-";
                break;
            case "M":
                result = n1 * n2;
                operatorString = "*";
                break;
            case "D":
                result = (double) n1 / n2;
                operatorString = "/";
                break;
            default:
                result = 0.0;
                System.out.println("Invalid Operator Selected.");
                System.out.println("Please Run Again.");
                break;
        }
        System.out.println("Result: ");
        System.out.println(n1 + " " + operatorString + " " + n2 + " = " + result);
    }
}
