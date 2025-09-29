package com.pluralsight;

import java.util.Scanner;

/**
 * These are exercises to reinforce my understanding of some of the concepts covered so far,
 * including: Scanner, switch, the Math library, and the ternary operator.
 * Link to specification for exercises:
 * <a href="https://github.com/BrightBoost/learningjava/blob/main/exercises/reinforcement-lesson.md">...</a>
 *
 * @author Ravi Spigner
 */
public class ReinforcementLab {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //step 3
        String name = getName();
        int age =  getAge();
        //step 5
        personalizedMessage(name, age);
        //step 4
        canVote(age);
        //step 6 completed - split program functions into methods
        //step 7
        isNameAlice(name);
        //step 8
        isNameBob(name, age);
        //step 9
        int numberToSqrt = 112;
        System.out.println("The square root of " + numberToSqrt + " is " +
                takeSquareRoot(numberToSqrt));
        //step 10
        printWelcomeMessage(name);
        //step 11
        int n1 = 300;
        int n2 = 47;
        System.out.println("Is n1: " + n1 + " greater than n2: " + n2 + "?: " +
                isN1GreaterThanN2(n1,n2));
        //step 12
        System.out.println(name.equals("Lara") ? "You, " + name + " are not welcome." :
                "You, " + name + " are welcome.");
        //step 13
        n1 = 18;
        n2 = -30;
        System.out.println("Between n1: " + n1 + " and n2: " + n2 + ", " +
                greatest(n1,n2) + " is the greater number.");
        //step 14 (printing three times for testing purposes)
        System.out.println("Your random number between 1 and 10 is: " + random1to10());
        System.out.println("Your random number between 1 and 10 is: " + random1to10());
        System.out.println("Your random number between 1 and 10 is: " + random1to10());
        //step 15
        n1 = 50;
        n2 = 11;
        System.out.println("Between n1: " + n1 + " and n2: " + n2 + ", " +
                least(n1,n2) + " is the lesser number.");
    }

    //part of step 3
    public static String getName() {
        System.out.print("Please enter your name: ");
        return scanner.nextLine();
    }
    //part of step 3
    public static int getAge() {
        System.out.print("Please enter your age as a whole number: ");
        int age = scanner.nextInt();
        scanner.nextLine(); //to jump over /n character after nextInt() to the next line to read
        return age;
    }
    //step 4
    public static void canVote(int age) {
        if (age >= 18) {
            System.out.println("You're old enough to vote.");
        } else {
            System.out.println("You're not old enough to vote.");
        }
    }
    //step 5
    public static void personalizedMessage(String name, int age) {
        System.out.println("Your name is " + name + " and you are " + age + " years old.");
    }
    //step 7
    public static void isNameAlice(String name) {
        if (name.equalsIgnoreCase("Alice")) {
            System.out.println("Your name IS Alice!");
        } else {
            System.out.println("Your name is not Alice.");
        }
    }
    //step 8
    public static void isNameBob(String name, int age) {
        if (name.equalsIgnoreCase("Bob") && age >= 21) {
            System.out.println("You're old enough to drink.");
        } else {
            System.out.println("You're not old enough to drink...yet.");
        }
    }
    //step 9
    public static double takeSquareRoot(double number) {
        return Math.round(Math.sqrt(number)*100.0)/100.0;
    }
    //step 10
    public static void printWelcomeMessage(String name) {
        switch(name) {
            case "Alice":
                System.out.println("Welcome, Alice!");
                break;
            case "Bob":
                System.out.println("Hey Bob, want to get a drink?");
                System.out.println("And if you're not 21 yet, let's make those drinks sodas!");
                break;
            default:
                System.out.println("This is a generic message for you, " + name);
                break;
        }
    }
    //step 11
    public static boolean isN1GreaterThanN2(int n1, int n2) {
        return n1>n2;
    }
    //step 13
    public static int greatest(int n1, int n2) {
        return Math.max(n1, n2);
    }
    //step 14
    public static int random1to10() {
        return (int)(Math.random()*10)+1; //excludes the number multiplied (0-9.999)
                                          //casting as int drops the decimal (9.999->9.0)
                                          //so then add 1 so the range goes from 0-9 -> 1-10
    }
    //step 15
    public static int least(int n1, int n2) {
        return Math.min(n1, n2);
    }
}