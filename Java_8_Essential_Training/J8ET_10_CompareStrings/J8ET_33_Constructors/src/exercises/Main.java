// Lynda.com Java 8 Essential Training exercise on using constructor methods

/*
 * Presses oil from different types of olives. Outputs the olive name and the total amount of oil pressed.
 * Uses different packages to encapsulate classes.
 */
package exercises;

import exercises.model.Olive;
import java.util.ArrayList;
import java.util.List;

/*
 * Main class contains the following methods:
 * main method: creates instance of List interface and adds olives and info about olives to the list. Creates instance
 * of OlivePress class, sets amount of oil to amount pressed from olives and prints the amount.
 */
public class Main {

    public static void main(String[] args) {

        // Creates instance of List interface and uses constructor method to instantiate ArrayList class.
        List<Olive> olives = new ArrayList<>();

        /*
        // Creates an instance of Olive class and instantiates it as Olive class.
        Olive olive1 = new Olive("Kalamata", 0x2E085, 3);
        // Adds olive to olives collection and passes instance of Olive class.
        olives.add(olive1);

        Olive olive2 = new Olive("Kalamata", 0x2E085, 3);
        olives.add(olive2);

        Olive olive3 = new Olive("Ligurian", 0x000000, 2);
        olives.add(olive3);
        */

        // Combines code for readability.
        // Adds olives to olives collection by passing instance of Olive class with parameters into add method.
        olives.add(new Olive("Kalamata", 0x2E085, 3));
        olives.add(new Olive("Kalamata", 0x2E085, 3));
        olives.add(new Olive("Ligurian", 0x00000, 2));

        // Creates instance of OlivePress class and uses constructor method to instantiate OlivePress class.
        OlivePress press = new OlivePress();

        // Creates int variable totalOil, assigns it to OlivePress instance, and passes olives collection
        // into getOil method that is implemented in Olive class.
        int totalOil = press.getOil(olives);
        // Prints amount of oil pressed from olives.
        System.out.println("Total olive oil: " + totalOil);
    }
}
