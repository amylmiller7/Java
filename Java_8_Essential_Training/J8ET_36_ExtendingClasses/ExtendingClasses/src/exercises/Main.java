// Lynda.com Java 8 Essential Training exercise on extending classes and overriding methods

/*
 * Presses oil from different types of olives. Outputs the olive name, the amount of oil pressed from each olive,
 * and the total amount of oil pressed.
 * Uses different packages to encapsulate classes.
 * Uses enums rather than constants.
 * Extends classes with super (Olive) and sub (Kalamata, Ligurian) classes and overrides methods.
 */
package exercises;

import exercises.model.*;
import java.util.ArrayList;
import java.util.List;


/*
 * Main class contains the following methods:
 * main method: creates instance of List interface and adds olives and info about olives to the list. Creates instance
 * of OlivePress class, sets amount of oil to amount pressed from olives, and prints the amount.
 */
public class Main {

    public static void main(String[] args) {

        // Creates instance of List interface and uses a constructor method to instantiate an ArrayList class.
        List<Olive> olives = new ArrayList<>();
        /*
        // Adds olives to olives collection by passing instance of Olive class with parameters
        // (including enums OliveName and OliveColor) into add method.
        olives.add(new Olive(OliveName.KALAMATA, OliveColor.PURPLE, 3));
        olives.add(new Olive(OliveName.KALAMATA, OliveColor.PURPLE, 3));
        olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
        olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
        olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
        olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
        */

        // Combines code for readability.
        // Adds olives to olives collection by passing Kalamata and Ligurian methods from Kalamata class.
        // Subclass of Olive (Kalamata, Ligurian) knows which arguments to pass into method.
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        // Creates instance of OlivePress class and instantiates it as OlivePress class.
        OlivePress press = new OlivePress();

        // Creates int variable totalOil, assigns it to OlivePress instance, and passes olives collection
        // into getOil method that is in Olive class.
        int totalOil = press.getOil(olives);
        // Prints amount of oil pressed from olives.
        System.out.println("You produced " + totalOil + " units of oil.");

    }
}
