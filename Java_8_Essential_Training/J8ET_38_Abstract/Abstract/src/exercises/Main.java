// Lynda.com Java 8 Essential Training exercise on abstract classes and methods

/*
 * Presses oil from different types of olives.
 * Outputs the starting amount of oil, the olive type, place of origin, amount of oil extracted,
 * and the total amount of oil.
 * Uses different packages to encapsulate classes.
 * Uses enums rather than constants.
 * Extends classes with super (Olive) and sub (Kalamata, Ligurian) classes and overrides methods.
 * Uses interface to abstract methods implemented in Olive class.
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

        // Adds olives to olives collection by passing Kalamata and Ligurian methods from Kalamata and Ligurian classes
        // into add method.
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());


        // Creates instance of Press interface and instantiates it as OlivePress class.
        Press press = new OlivePress();
        // Because OlivePress implements Press interface, press has setOil method.
        // Sets initial amount of oil before crush method called in application.
        press.setOil(5);

        // Creates int variable totalOil, assigns it to Press instance, and passes olives collection
        // into getOil method that is in Olive class.
        int totalOil = press.getOil(olives);
        // Prints amount of oil pressed from olives.
        System.out.println("In total, you produced " + totalOil + " units of oil.");

        /*
        // Instantiates interface directly.
        // Adds implementation of all the abstract methods of the class.
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
