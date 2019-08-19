// Lynda.com Java 8 Essential Training exercise on using static variables as constants

/*
 * Presses oil from different types of olives. Outputs the olive name and the total amount of oil pressed.
 * Uses different packages to encapsulate classes.
 * Uses constants rather than enums.
 */
package exercises;
import exercises.model.Olive;
import java.util.ArrayList;
import java.util.List;

/*
 * Main class contains the following methods:
 * main method: creates instance of List interface and adds olives and info about olives to the list. Creates instance
 * of OlivePress class, sets amount of oil to amount pressed from olives, and prints the amount.
 */
public class Main {

    public static void main(String[] args) {

        // Creates instance of List interface and uses constructor method to instantiate ArrayList class.
        List<Olive> olives = new ArrayList<>();
        // Adds olives to olives collection by passing instance of Olive class with parameters into add method.
        olives.add(new Olive(Olive.KALAMATA, 0x2E0854, 3));
        olives.add(new Olive(Olive.KALAMATA, 0x2E0854, 3));
        olives.add(new Olive(Olive.LIGURIAN, 0x000000, 2));
        olives.add(new Olive(Olive.LIGURIAN, 0x000000, 2));
        olives.add(new Olive(Olive.LIGURIAN, 0x000000, 2));
        olives.add(new Olive(Olive.LIGURIAN, 0x000000, 2));

        // Creates instance of OlivePress class and instantiates it as OlivePress class.
        OlivePress press = new OlivePress();

        // Creates int variable totalOil, assigns it to OlivePress instance, and passes olives collection
        // into getOil method that is in Olive class.
        int totalOil = press.getOil(olives);
        // Prints amount of oil pressed from olives.
        System.out.println("Total olive oil: " + totalOil);
    }
}
