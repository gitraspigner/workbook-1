package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {
        /**
         * Exercise 2 - Step 1
         * Write code to find answers to the following questions.
         * Questions:
         * 1. Declare a variable to store your favorite color
         * 2. Declare a variable to store the year you started this class
         * 3. Declare a variable to store your middle initial
         * 4. Declare a variable to store whether you have pets (yes/no)
         * 5. Declare a variable with a nice message or saying
         * 64
         * 6. Print each variable with a descriptive message
         */
        String favoriteColor = "black";
        int classStartDate = 2025;
        char middleInitial = 'R';
        boolean hasPets = false;
        String niceNumberMessage = "'I have a nice message, which is this message. But here is also" +
                " a nice number:' " + 64;
        System.out.println("Favorite Color: " + favoriteColor + ". Start Date of YearUp/LTCA: " + classStartDate +
                ". My Middle Initial: " + middleInitial + ". Do I have pets?: " + hasPets + "." +
                "\nHere is a nice message (including a special number): " + niceNumberMessage + ".");
        System.out.println("End of output for Exercise 2 - Step 1.");

        /**
         * Step 2
         * 1. Declare AND initialize variables for:
         * 2. The number of days in a week
         * 3. The price of coffee ($4.99)
         * 4. Your favorite letter
         * 5. Whether it's raining (true/false)
         * 6. Print all values in complete sentences
         */
        int daysInWeek = 7;
        double singleCoffeePrice = 4.99;
        char favoriteLetter = 'X';
        boolean isRaining = false; //although it should be raining in Seattle right now
        System.out.println("The number of days in a week is: " + daysInWeek +
                ". The price of a single coffee is: $" + singleCoffeePrice +
                ". My favorite letter is: " + favoriteLetter + ". Is it raining right now?: " +
                isRaining + ".");
        System.out.println("End of output for Exercise 2 - Step 2.");
    }
}
