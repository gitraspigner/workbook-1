package com.pluralsight;

/**
 * Exercises to test my knowledge of methods.
 * Program prints an RPG-style story to the console.
 *
 * @author Ravi Spigner
 */
public class MethodMiniExercises1 {
    /**
     * Putting it all together
     * In all exercises:
     * → Call each method from main() — make it look like a little game story!
     */
    public static void main(String[] args) {
        printWelcome();
        displayPlayerName("Finn");
        showLevel(47);
        enterDungeon("Finn", "Warwick");
        foundItem("Finn", "Sword");
        foundItem("Finn", "Shield");
        attack("Zombie", "Finn");
        castSpell("Finn","Healing",10);
        attack("Finn", "Zombie");
        castSpell("Finn","Fireball",10);
        victoryDance("Finn");
        foundItem("Finn", "Pizza");
        showLevel(48);
        displayInventory("Finn", 20);
        attack("Sneaky Demon Skeleton", "Finn");
        gameOver("Finn");
        enterDungeon("Finn", "Afterlife");
    }

    /**
     * public static void printWelcome()
     *     Write a static method that prints:
     * "Welcome to Code Quest!"
     * → Then invoke it in main().
     */
    public static void printWelcome() {
        System.out.println("Welcome to Code Quest!");
    }

    /**
     * public static void displayPlayerName(String playerName)
     *     Write a static method that prints:
     * "Player joined: [name]"
     * → Call it with a name of your choice.
     */
    public static void displayPlayerName(String playerName) {
        System.out.println("Player joined: " + playerName);
    }

    /**
     * public static void showLevel(int level)
     *     Write a static method that prints:
     * "Level: [level]"
     * → Call it twice with different levels.
     */
    public static void showLevel(int level) {
        System.out.println("Level: " + level);
    }

    /**
     * public static void attack(String attacker, String target)
     *     Write a static method that prints:
     * "[attacker] attacks [target]!"
     * → Simulate two different attacks.
     */
    public static void attack(String attacker, String target) {
        System.out.println(attacker + " attacks " + target + "!");
    }

    /**
     * public static void foundItem(String player, String item)
     *     Write a static method that prints:
     * "[player] found a [item]!"
     * → Call it for a sword, a shield, and a pizza.
     */
    public static void foundItem(String player, String item) {
        System.out.println(player + " found a " + item + "!");
    }

    /**
     * public static void castSpell(String wizard, String spellName, int manaCost)
     *     Write a static method that prints:
     * "[wizard] casts [spellName] costing [manaCost] mana!"
     * → Call it for a fireball and a healing spell.
     */
    public static void castSpell(String wizard, String spellName, int manaCost) {
        System.out.println(wizard + " casts " + spellName  + " costing " + manaCost + " mana!");
    }

    /**
     * public static void gameOver(String player)
     *     Write a static method that prints:
     * "GAME OVER for [player]!"
     * → Call it for a player of your choice.
     */
    public static void gameOver(String player) {
        System.out.println("GAME OVER for " + player + "!");
    }

    /**
     * public static void displayInventory(String player, int itemCount)
     *     Write a static method that prints:
     * "[player] has [itemCount] items in inventory."
     * → Call it with any player and number.
     */
    public static void displayInventory(String player, int itemCount) {
        System.out.println(player + " has " + itemCount + " items in inventory.");
    }

    /**
     * public static void enterDungeon(String player, String dungeonName)
     *     Write a static method that prints:
     * "[player] bravely enters the [dungeonName]."
     * → Call it with at least two funny dungeon names.
     */
    public static void enterDungeon(String player, String dungeonName) {
        System.out.println(player + " bravely enters " + dungeonName + " dungeon.");
    }

    /**
     * public static void victoryDance(String player)
     *     Write a static method that prints:
     * "[player] does a little victory dance!"
     * → Call it after a player wins a fight.
     */
    public static void victoryDance(String player) {
        System.out.println(player + " does a little victory dance!");
    }
}
