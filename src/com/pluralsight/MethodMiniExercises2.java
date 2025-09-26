package com.pluralsight;

import java.util.Scanner;

/**
 * Exercises to test my knowledge of methods.
 * Program prints an RPG-style story to the console.
 *
 * @author Ravi Spigner
 */
public class MethodMiniExercises2 {
    /**
     * Wrap it all in a text-based story in main() that uses multiple of your
     * methods to simulate a mini game round.
     */
    public static void main(String[] args) {
        System.out.println(getPlayerTitle("Jake"));

        System.out.println("Doubling your current xp, it is now: " + doubleXP(50));

        if (hasLeveledUp(100, 200)) {
            System.out.println("You leveled up!");
        } else {
            System.out.println("Keep grinding...");
        }

        System.out.println("You rolled a: " + rollDice());
        System.out.println("You rolled a: " + rollDice());
        System.out.println("You rolled a: " + rollDice());

        System.out.println("Damage dealt: " + calculateDamage(100, 20));

        System.out.println("Can you open a chest without a key if the lock is not broken?: ");
        System.out.println(canOpenChest(false, false));
        System.out.println("Can you open a chest without a key if the lock is broken?: ");
        System.out.println(canOpenChest(false, true));
        System.out.println("Can you open a chest with a key if the lock is not broken?: ");
        System.out.println(canOpenChest(true, false));
        System.out.println("Can you open a chest with a key if the lock is broken?: ");
        System.out.println(canOpenChest(true, true));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number between 1-3 for your class: ");
        int choice = scanner.nextInt();
        System.out.println("Your class is: " + getPlayerClass(choice));

        System.out.println(addGold(90, 110));

        if (isQuestComplete(9,10)) {
            System.out.println("Quest complete!");
        } else {
            System.out.println("You still have work to do.");
        }

        //use a potion to instakill the boss if player has within 49 hp of them
        if (isBossDefeated(151, 200, true)) {
            System.out.println("Boss defeated!");
        } else {
            System.out.println("Boss not defeated...");
        }

        scanner.close();
    }

    /**
     * public static String getPlayerTitle(String name)
     *
     *     Return a string like:
     *     "Lord " + name or "Princess " + name"
     *     → Call it in main() and print the result.
     */
    public static String getPlayerTitle(String name) {
        return "Adventurer " + name;
    }

    /**
     * public static int doubleXP(int xp)
     *
     *     Given an XP amount, return double that amount.
     *     → Print the original and doubled XP.
     */
    public static int doubleXP(int xp) {
        return xp*2;
    }

    /**
     * public static boolean hasLeveledUp(int currentXP, int threshold)
     *
     *     Return true if currentXP is greater than or equal to threshold, otherwise false.
     *
     * 🧠 Add an if in main() to print:
     *
     *     "You leveled up!" or
     *     "Keep grinding..."
     */
    public static boolean hasLeveledUp(int currentXP, int threshold) {
        return currentXP >= threshold;
        /**
         * Alternatively this will work if we want to use an if else:
         *         if (currentXP >= threshold) {
         *             return true;
         *         } else {
         *             return false;
         *         }
         *
         */
    }

    /**
     * public static int rollDice()
     *
     *     Return a random number from 1 to 6 using Math.random() (simulate a dice roll).
     *     → Call it 3 times and print each roll.
     */
    public static int rollDice() {
        return (int) (Math.random()*6) + 1;
    }

    /**
     * public static int calculateDamage(int strength, int enemyDefense)
     *
     *     Return the result of:
     *
     * (strength * 2) - enemyDefense
     *
     * → If result is less than 0, return 0.
     * → Print the damage dealt.
     */
    public static int calculateDamage(int strength, int enemyDefense) {
        int damage = (strength*2) - enemyDefense;
        if (damage < 0) {
            return 0;
        } else {
            return damage;
        }
        // Alternatively, if else can be substituted with: return Math.max(damage, 0);
    }

    /**
     * public static boolean canOpenChest(boolean hasKey, boolean lockIsBroken)
     *
     *     Return true if the player has a key or the lock is broken.
     *     → Test all 4 possible combinations in main().
     */
    public static boolean canOpenChest(boolean hasKey, boolean lockIsBroken) {
        return hasKey || lockIsBroken;
    }

    /**
     * public static String getPlayerClass(int choice)
     *
     *     Based on an int input, return a class name:
     *
     * 1 → "Warrior"
     * 2 → "Mage"
     * 3 → "Rogue"
     * default → "Peasant"
     *
     * → Ask the user for input using Scanner, then print their class.
     */
    public static String getPlayerClass(int choice) {
        if (choice == 1) {
            return "Warrior";
        } else if (choice == 2) {
            return "Mage";
        } else if (choice == 3) {
            return "Rogue";
        } else {
            return "Peasant";
        }
    }

    /**
     * public static int addGold(int currentGold, int goldFound)
     *
     *     Return the new total gold after looting.
     *     → Bonus: if goldFound is over 100, add a 10% tax (deduct it before adding).
     *     → Print the final amount of gold.
     */
    public static int addGold(int currentGold, int goldFound) {
        int finalgold;
        if (goldFound > 100) {
            finalgold = (int) Math.round(currentGold+(goldFound*0.90));
        } else {
            finalgold = currentGold+goldFound;
        }
        System.out.println("Final gold: " + finalgold);
        return finalgold;
    }

    /**
     * public static boolean isQuestComplete(int tasksDone, int totalTasks)
     *
     *     Return true if tasksDone == totalTasks.
     *     → Add a message in main():
     *
     *     True - "Quest complete!"
     *     False - "You still have work to do."
     */
    public static boolean isQuestComplete(int tasksDone, int totalTasks) {
        return tasksDone == totalTasks;
    }

    /**
     * public static boolean isBossDefeated(int playerHP, int bossHP, boolean usedPotion)
     *
     *     If bossHP <= 0, return true.
     *     Else if playerHP <= 0 and potion wasn’t used → return false.
     *     Else if potion was used, restore 50 HP and return playerHP + 50 > bossHP.
     *
     * → Try calling this with different values and print whether the boss is defeated.
     */
    public static boolean isBossDefeated(int playerHP, int bossHP, boolean usedPotion) {
        if (bossHP <= 0) {
            return true;
        } else if (playerHP <= 0 && !usedPotion) {
            return false;
        } else if (usedPotion) {
            return playerHP+50 > bossHP; //which is saying the boss is defeated if player
                                         //and boss are alive, but you use a potion
                                         //using a potion instakills a boss
        } else {
            return false;
        }
    }
}