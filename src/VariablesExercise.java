public class VariablesExercise {

    public static void main(String[] args) {
        int vehicleID = 1023060;
        String vehicleMakeAndModel = "Toyota Camry";
        String vehicleColor = "Burgundy";
        boolean vehicleHasTowingPackage = false;
        int odometerReading = 123456;
        double price = 5000.70;
        char qualityRating = 'b';
        String phoneNumber = "+1 420-899-1014";
        String ssn = "123-45-678";
        int zipCode = 12345;
        /**
         *         Thoughts on zipCode: char works for storing the zip code, but for
         *         displaying/printing will print an actual character instead, also
         *         char values are always between 0 and 65,535 (which is 2^16 - 1)
         *         which is advantageous here because zip codes are 5 digits
         *         but if your zip code is 98104 (my old zip code) using char
         *         to store this will not work
         *         I think it's better to use a string or an int for this type of value.
         */
        System.out.println("Seeing this means Variables Exercise has been run.");
    }
}