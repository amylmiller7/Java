package exercises;

import exercises.model.Olive;
import java.util.List;

/*
 * OlivePress class contains the following methods:
 * getOil method: sets totalOil variable, loops over olives collection, prints the name of each olive, and
 * adds the amount of oil pressed from the olives.
 */
public class OlivePress {
    // Creates an instance method (a method that is a member of the OlivePress class).
    // public allows it to be called from other classes/anywhere in application.
    public int getOil(List<Olive> olives) {

        int totalOil = 0;

        // for each loop iterates over olives collection (type var : array).
        for (Olive o : olives) {
            // Calls getName method in Olive class for each olive in olives collection and prints value.
            System.out.println(o.getName());
            // Calls getOil method in Olive class for each olive in olives collection and adds it to totalOil variable.
            totalOil += o.getOil();
        }

        return totalOil;
    }

}
