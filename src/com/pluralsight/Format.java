package com.pluralsight;

/**
 * Displays a first and last name in a reverse format: "Last Name, First Name".
 *
 * @author Ravi Spigner
 */
public class Format {
    public static void main(String[] args) {
        String formattedName = formatName("Jane", "Doe");
        System.out.println(formattedName);
    }

    public static String formatName(String first, String last) {
        return last + ", " + first;
    }
}