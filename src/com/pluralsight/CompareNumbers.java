package com.pluralsight;

/**
 * This program tests integer values for if they are even (or not),
 * and decimal values for if they are  positive (or not, and treats 0
 * as a non-positive value).
 *
 * @author Ravi Spigner
 */
public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println("5 Tests for isEven() below should display true:");
        //Below display true, are even
        System.out.println(isEven(2));
        System.out.println(isEven(16));
        System.out.println(isEven(100));
        System.out.println(isEven(-100));
        System.out.println(isEven(0));
        System.out.println();

        System.out.println("5 Tests for isEven() below should display false:");
        //Below display false, are not even, are odd instead
        System.out.println(isEven(1));
        System.out.println(isEven(13));
        System.out.println(isEven(99));
        System.out.println(isEven(-99));
        System.out.println(isEven(63));
        System.out.println();

        System.out.println("3 Tests for isPositive() below should display true:");
        //Below display true, are positive
        System.out.println(isPositive(0.01));
        System.out.println(isPositive(2.0));
        System.out.println(isPositive(21.5));
        System.out.println();

        System.out.println("3 Tests for isPositive() below should display false:");
        //Below display false, are not positive, are negative (or zero) instead
        System.out.println(isPositive(0));
        System.out.println(isPositive(-0.01));
        System.out.println(isPositive(-44.87));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPositive(double number) {
        return number > 0.0;
    }
}