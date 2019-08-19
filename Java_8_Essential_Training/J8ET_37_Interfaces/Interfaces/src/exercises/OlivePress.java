package exercises;

import exercises.model.Olive;
import java.util.List;

/*
 * OlivePress class implements Press interface, which allows it access to the methods in the interface.
 * Interface (contract or blueprint) that defines a set up abstract methods (only signature, no body).
 * Contains body (code to execute) for abstract methods getOil and setOil.
 * getOil method: overrides getOil method in Press interface. Sets totalOil variable, loops over olives collection,
 * and adds the amount of oil pressed from the olives.
 * setOil method: overrides setOil method in Press interface.
 */

public class OlivePress implements Press {
    // private indicates that this variable is only accessible inside this class/through the methods in this class.
    private int currentOil;

    // Method from Press interface implemented in this class.
    // Creates an instance method (a method that is a member of the OlivePress class).
    // public allows it to be called from other classes/anywhere in application.
    @Override
    public int getOil(List<Olive> olives) {

        int totalOil = currentOil;

        // for each loop iterates over olives collection (type var : array).
        for (Olive o : olives) {
            // Calls crush method in Olive class for each olive in olives collection and adds it to totalOil variable.
            // crush method defined in Olive class.
            totalOil += o.crush();
        }

        return totalOil;

    }

    // Overrides setOil method of parent (Press interface).
    @Override
    // Method from Press interface implemented in this class.
    // Initializes the amount of oil that the press already has before calling the getOil method.
    // setOil method called in Main class.
    public void setOil(int oil) {
        currentOil = oil;
    }

}
