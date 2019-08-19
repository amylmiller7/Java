// Project that builds on Lynda.com Java 8 Essential Training exercise on Javadoc

/* Presses oil from different types of olives. Outputs the olive name, the amount of oil pressed from each olive,
 * and adds the total amount of oil pressed.
 * Uses different packages to encapsulate classes.
 * Uses enums rather than constants.
 * Extends classes with super (Olive) and sub (Kalamata, Ligurian) classes and overrides methods.
 * Uses interface to abstract methods implemented in Olive class.
 * Contains comments for Javadoc.
 */
package exercises;

import exercises.model.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // This method creates an array of olives, sets amount of oil already pressed, and prints total amount of oil pressed.
    public static void main(String[] args) {

        // Creates an array by declaring an instance of the List interface.
        List<Olive> olives = new ArrayList<>();

        // Adds olives to the array by passing new instances of the Kalamata and Ligurian classes.
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        // Creates a new instance of the Press interface.
        Press press = new OlivePress();

        // Sets the amount of oil before crushing any olives.
        press.setOil(0);

        // The total amount of oil pressed from the olives.
        int totalOil = press.getOil(olives);
        // Prints the total amount of oil obtained before and after crushing the oils.
        System.out.println("You produced " + totalOil + " units of oil.");

    }
}
