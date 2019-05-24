// Lynda.com Java 8 Essential Training exercise on interfaces

/*
 * Presses oil from different types of olives. Outputs the olive name, the amount of oil pressed from each olive,
 * and adds the total amount of oil pressed.
 * Uses different packages to encapsulate classes.
 * Uses enums rather than constants.
 * Extends classes with super (Olive) and sub (Kalamata, Ligurian) classes and overrides methods
 * Uses interface for abstract methods implemented in Olive class.
 */
package exercises;

import exercises.model.*;
import java.util.ArrayList;
import java.util.List;

/*
 * Main class contains the following methods:
 * main method: creates instance of List interface and adds olives and info about olives to the list. Creates instance
 * of Press interface, sets amount of oil before olives are crushed, prints total amount of oil (pre- and post-crush amount).
 */
public class Main {

    public static void main(String[] args) {

        // Creates instance of List interface and uses a constructor method to instantiate an ArrayList class.
        List<Olive> olives = new ArrayList<>();

        // Adds olives to olives collection by passing Kalamata and Ligurian methods from Kalamata class.
        // Subclass of Olive (Kalamata, Ligurian) knows which arguments to pass into method.
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        // Creates instance of Press interface and instantiates it as OlivePress class.
        Press press = new OlivePress();
        // Because OlivePress implements Press interface, press has setOil method.
        // Calls setOil method, which is accessible because OlivePress implements the Press interface.
        press.setOil(0);

        // Creates int variable totalOil, assigns it to Press instance, and passes olives collection
        // into getOil method that is in Olive class.
        int totalOil = press.getOil(olives);
        // Prints amount of oil pressed from olives.
        System.out.println("You produced " + totalOil + " units of oil.");

        /*
        // Instantiates interface directly.
        // Adds implementation of all of the abstract methods of the class.
        Press p2 = new Press() {

            @Override
            public int getOil(List<Olive> olives) {
                return 0;
            }

            @Override
            public void setOil(int oil) {

            }
        }*/

    }
}
