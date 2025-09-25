package com.pluralsight;

import java.util.Scanner;

/**
 * Simulates ordering from a sandwich shop given 2 sizes: Regular and Large, loaded or not
 * (additional charge applies), and gives different discounts for students and seniors who order.
 * a
 *
 * @author Ravi Spigner
 */
public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Sandwich Shop!");
        System.out.println("Let's start with the size of your sandwich.");
        System.out.println("For Regular ($5.45) enter 1.");
        System.out.println("For Large ($8.95) enter 2.");
        System.out.print("Please enter your sandwich size selection: ");
        int sandwichSize = scanner.nextInt();

        System.out.println("Would you like your sandwich to be loaded (double toppings)?");
        System.out.println("For yes enter 1.");
        System.out.println("For no enter 2.");
        System.out.print("Please enter your loaded/not loaded selection: ");
        int loaded = scanner.nextInt();

        System.out.println("Great, now for your age to determine your discount.");
        System.out.print("Please enter your current age (in years): ");
        int age = scanner.nextInt();


        double sandwichPrice = 0.0;
        double discountMultiplier;

        if (sandwichSize == 1) {
            sandwichPrice = 5.45;
            if (loaded == 1) {
                sandwichPrice = 6.45;
            }
        } else if (sandwichSize == 2) {
            sandwichPrice = 8.95;
            if (loaded == 1) {
                sandwichPrice = 9.70;
            }
        } else {
            System.out.println("Invalid sandwich size given. Please try ordering again.");
            System.out.println("(Run this program again.)");
        }

        if (age <= 17) {
            discountMultiplier = 0.90; //10% off for students
        } else if (age >= 65) {
            discountMultiplier = 0.80; //20% off for seniors
        } else {
            discountMultiplier = 1.00; //no discount given for other ages
        }

        double totalSandwichPrice = sandwichPrice * discountMultiplier;

        System.out.printf("The cost of your sandwich is: $%.2f%n", totalSandwichPrice);
        System.out.println("Enjoy your tasty treat! Please come again!");
        System.out.println("(Er- I mean, run this program again.)");
    }
}
