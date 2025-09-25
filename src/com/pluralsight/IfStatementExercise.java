package com.pluralsight;

/**
 * Exercises for conditionals, based off of starter code from Maaike Van Putten
 *
 * @author Ravi Spigner
 */
public class IfStatementExercise {
    public static void main(String[] args) {
        // Exercise 1: Is it positive?
        int number = 7;
        // print "Positive number" if number > 0, otherwise "Not positive"
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Not positive");
        }

        // Exercise 2: Even or odd
        int x = 10;
        // print "Even" if x is divisible by 2, otherwise "Odd"
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Exercise 3: Temperature check
        int temperature = 30; // celcius
        // print "Hot" if temperature > 25, otherwise "Not hot"
        if (temperature > 25) {
            System.out.println("Hot");
        } else {
            System.out.println("Not hot");
        }

        // Exercise 4: Teenager check
        int age = 15;
        // print "Teenager" if age is between 13 and 19, otherwise "Not a teenager"
        if (age > 13 && age < 19) {
            System.out.println("Teenager");
        } else {
            System.out.println("Not a teenager");
        }

        // Exercise 5: Can vote?
        int age2 = 17;
        // print "Can vote" if age2 >= 18, otherwise "Too young to vote"
        if (age2 >= 18) {
            System.out.println("Can vote");
        } else {
            System.out.println("Too young to vote");
        }

        // Exercise 6: Multiple of both
        int y = 30;
        // print "Divisible by 3 and 5" if divisible by both, otherwise "Not divisible by 3 and 5"
        if (y % 3 == 0 && y % 5 == 0) {
            System.out.println("Divisible by 3 and 5");
        } else {
            System.out.println("Not divisible by 3 and 5");
        }

        // Exercise 7: Outside safe range
        int speed = 120;
        // print "Unsafe speed" if speed < 30 or speed > 100, otherwise "Safe speed"
        if (speed < 30 || speed > 100) {
            System.out.println("Unsafe speed");
        } else {
            System.out.println("Safe speed");
        }

        // Exercise 8: Leap year check (simplified)
        int year = 2025;
        // print "Leap year" if year divisible by 4 and not divisible by 100, otherwise "Not leap year"
        if (year % 4 == 0 && year % 10 != 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }

        // Exercise 9: Bigger number
        int a = 8;
        int b = 12;
        // print which one is bigger (a or b)
        if  (a > b) {
            System.out.println("A is bigger");
        } else if (a < b) {
            System.out.println("B is bigger");
        } else {
            System.out.println("A and B are equal");
        }

        // Exercise 10: Grade check
        int score = 55;
        // print "Pass" if score >= 50, otherwise "Fail"
        if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
