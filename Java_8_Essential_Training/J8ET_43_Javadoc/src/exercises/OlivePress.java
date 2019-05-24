package exercises;

import exercises.model.Olive;
import java.util.List;

/*
 * This class implements the Press interface, which allows it access to the methods in the interface.
 * Interfaces define methods (signature only, no body).
 * Classes that implement interfaces include the code to execute the methods.
 */

/**
 * Gets the total amount of oil from pressing the olives.
 * <p>
 * Implements abstract methods (getOil and setOil) from Press interface.
 */
public class OlivePress implements Press {
    // Creates variable for amount of oil pressed from olives. Only accessible inside this class.
    private int currentOil;

    /*
     * Method from Press interface implemented in this class. Can be called from other classes in the application.
     * Creates an instance method (a method that is a member of the OlivePress class).
     */

    /**
     * Adds oil pressed from all olives in collection to current amount of oil.
     *
     * @param olives  the collection of olives
     * @return the total amount of oil pressed from olives added to current amount of oil
     * @see #setOil
     */
    @Override
    public int getOil(List<Olive> olives) {

        /**
         * The amount of oil already pressed from olives.
         */
        int totalOil = currentOil;

        // for each loop iterates over olives collection (type var : array).
        for (Olive o : olives) {
            // Calls crush method in Olive class for each olive in olives collection and adds it to totalOil variable.
            totalOil += o.crush();
        }

        return totalOil;

    }

    // Method from Press interface implemented in this class. Can be called from other classes in the application.

    /**
     *  Sets the amount of oil before calling the getOil method, which returns amount of oil pressed from olives.
     *
     * @param oil  the amount of oil
     */
    @Override
    public void setOil(int oil) {
        currentOil = oil;
    }
}
