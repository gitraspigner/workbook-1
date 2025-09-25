package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = scanner.nextLine();
        System.out.println("How many hours have you worked?: ");
        float hours = scanner.nextFloat();
        System.out.println("What is your pay rate?: ");
        float payRate = scanner.nextFloat();
        float grossPay = hours * payRate;
        System.out.println("Name: " + name);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);

    }
}
