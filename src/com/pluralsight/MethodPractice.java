package com.pluralsight;

/**
 * Displays 3 messages, one greeting the world, one that says good morning,
 * and another that says goodbye.
 *
 * @author Ravi Spigner
 */
public class MethodPractice {
    public static void main(String[] args) {
        sayHello();
        sayGoodMorning();
        sayGoodbye();
    }

    public static void sayHello() {
        System.out.println("Hello World!");
    }

    public static void sayGoodbye() {
        System.out.println("Goodbye!");
    }

    public static void sayGoodMorning() {
        System.out.println("Good morning!");
    }
}