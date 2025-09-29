package com.pluralsight;

import java.util.Scanner;

/**
 * Calculates the cost of a car rental based off of input from the user which includes their
 * age, the amount of days they want to rent for, and whether they'd like a toll tag, a gps,
 * and/or roadside assistance.
 *
 * @author Ravi Spigner
 */
public class RentalCarCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //get user input for rental car options
        int age = getAge();
        String pickupDate = getPickupDate();
        int rentalDays = getDaysOfRental();
        boolean wantsTollTag = getTollTagDecision();
        boolean wantsGps = getGpsDecision();
        boolean wantsRoadsideAssistance = getRoadsideAssistanceDecision();
        //calculate and display the rental car costs to the user
        calcAndDisplayCosts(age, pickupDate, rentalDays, wantsTollTag, wantsGps, wantsRoadsideAssistance);
        scanner.close();
    }

    //methods to prompt user for input and return calculated values

    public static int getAge() {
        System.out.println("What is your current age?");
        System.out.print("Please enter your response as a single whole number: ");
        int age = scanner.nextInt();
        scanner.nextLine(); //put scanner to next line of input after reading an int
        return age;
    }

    public static String getPickupDate() {
        System.out.println("What date are you picking up your rental?");
        System.out.print("Please enter your response in the format MM/DD/YYYY: ");
        return scanner.nextLine();
    }

    public static int getDaysOfRental() {
        System.out.println("How many days are you requesting a rental for?");
        System.out.print("Please enter your response as a single whole number: ");
        int daysOfRental = scanner.nextInt();
        scanner.nextLine(); //put scanner to next line of input after reading an int
        return daysOfRental;
    }

    public static boolean getTollTagDecision() {
        System.out.println("Would you like an electronic toll tag at the rate of $3.95/day?");
        System.out.print("Please enter your response as Y for yes, or N for no: ");
        String response = scanner.nextLine().toUpperCase();
        if (response.equals("Y")) {
            return true;
        } else if (response.equals("N")) {
            return false;
        } else {
            return false; //if no valid option is selected, pick N/no for them
        }
    }

    public static boolean getGpsDecision() {
        System.out.println("Would you like a GPS at the rate of $2.95/day?");
        System.out.print("Please enter your response as Y for yes, or N for no: ");
        String response = scanner.nextLine().toUpperCase();
        if (response.equals("Y")) {
            return true;
        } else if (response.equals("N")) {
            return false;
        } else {
            return false; //if no valid option is selected, pick N/no for them
        }
    }

    public static boolean getRoadsideAssistanceDecision() {
        System.out.println("Would you like roadside assistance at the rate of $3.95/day?");
        System.out.print("Please enter your response as Y for yes, or N for no: ");
        String response = scanner.nextLine().toUpperCase();
        if (response.equals("Y")) {
            return true;
        } else if (response.equals("N")) {
            return false;
        } else {
            return false; //if no valid option is selected, pick N/no for them
        }
    }


    //a method to calculate and display all final costs
    public static void calcAndDisplayCosts(int age, String pickupDate, int rentalDays,
                                           boolean wantsTollTag, boolean wantsGps,
                                           boolean wantsRoadsideAssistance) {

        double totalCost = 0.0;
        double baseRentalPrice =  rentalDays * 29.99;
        double underageDriverSurcharge = 0.0;
        if (age < 25) {
            underageDriverSurcharge = baseRentalPrice * 0.70; //30% of base price

        }

        totalCost += baseRentalPrice + underageDriverSurcharge;

        double tollTagCost = 0.0;
        if(wantsTollTag) {
            tollTagCost = rentalDays * 3.95;
        }
        totalCost += tollTagCost;

        double gpsCost = 0.0;
        if(wantsGps) {
            gpsCost = rentalDays * 2.95;
        }

        totalCost += gpsCost;

        double roadsideAssistanceCost = 0.0;
        if(wantsRoadsideAssistance) {
            roadsideAssistanceCost += (rentalDays * 3.95);
        }

        totalCost += roadsideAssistanceCost;

        System.out.println("Here are your calculated prices:");
        System.out.printf("Basic Car Rental: $%.2f%n", baseRentalPrice);
        System.out.printf("Total of Rental Extra Options Selected: $%.2f%n", tollTagCost+gpsCost+
                roadsideAssistanceCost);
        System.out.printf("Underage Driver Surcharge: $%.2f%n", underageDriverSurcharge);
        System.out.printf("Total Cost: $%.2f%n", totalCost);
        System.out.println("Pickup Date: " + pickupDate);
    }
}