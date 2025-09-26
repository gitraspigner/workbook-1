package com.pluralsight;
import java.util.Scanner;


public class InputExcercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your favorite animal?: ");
        String favoriteAnimal = input.nextLine();
        System.out.print("What the first tool you can think of that comes to mind?: ");
        String firstTool = input.nextLine();
        System.out.print("What is the number (day) of your birthday?: ");
        int bdayNumber = input.nextInt();

        System.out.println("Your favorite animal is a: " + favoriteAnimal + ", the first tool " +
                "that comes to mind is a: " + firstTool + ", and " + bdayNumber + " is the day " +
                "you were born.");
        input.close();
    }
}
