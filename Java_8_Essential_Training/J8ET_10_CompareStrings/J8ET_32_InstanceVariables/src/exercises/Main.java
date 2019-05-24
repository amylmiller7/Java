// Lynda.com Java 8 Essential Training exercise on instance variables

/*
 * Presses oil of varying amounts from Kalamata olives. Outputs the olive name and the total amount of oil pressed.
 * Uses different packages to encapsulate classes.
 */
package exercises;

import exercises.model.Olive;
import java.util.ArrayList;
import java.util.List;

/*
 * Main class contains the following methods:
 * main method: creates instance of List interface and instance of Olive class,
 * adds olives to the list and sets amount oil pressed from oil.
 * Creates instance of OlivePress class, sets amount of oil to amount pressed from olives, and prints the amount.
 */
public class Main {

    public static void main(String[] args) {

        // Creates instance of List interface and uses constructor method to instantiate ArrayList class.
        List<Olive> olives = new ArrayList<>();

        // Creates an instance of Olive class and uses a constructor method to instantiates an Olive class.
        Olive olive1 = new Olive();
        // Adds olive to olives collection with add method.
        olives.add(olive1);

        Olive olive2 = new Olive();
        // Calls setOil method on olive and passes amount of oil for this particular olive
        olive2.setOil(1);
        olives.add(olive2);

        Olive olive3 = new Olive();
        olive3.setOil(4);
        olives.add(olive3);

        // Creates instance of OlivePress class and uses constructor method to instantiate OlivePress class.
        OlivePress press = new OlivePress();

        // Creates int variable totalOil, assigns it to OlivePress instance, and passes olives collection
        // into getOil method that is implemented in Olive class.
        int totalOil = press.getOil(olives);
        System.out.println("total olive oil: " + totalOil);
    }
}
