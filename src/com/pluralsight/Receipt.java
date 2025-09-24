package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        /**
         * 1. Create variables for an item name (String) and item price (double)
         * 2. Create a quantity variable (int)
         * 3. Build and print: EX. "You bought 3 apples for $7.10"
         */
        String itemName = "Pen";
        double itemPrice = 1.99;
        int quantity = 123;
        System.out.println("You bought " + quantity + " " + itemName + "s for $" +
                itemPrice * quantity + ".");

    }
}
