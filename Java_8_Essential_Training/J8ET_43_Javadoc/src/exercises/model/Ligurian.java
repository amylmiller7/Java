package exercises.model;

// Subclass of the Olive class. Implements abstract method getOrigin.

/**
 * Defines the characteristics of Ligurian olives (name, color, origin, amount of oil pressed from this type of olive).
 * <p>
 * Sets olive name, color, and amount of oil pressed of this type of olive. Returns origin of Ligurian olives.
 */
public class Ligurian extends Olive {

    /**
     * Creates and initializes a new Ligurian olive.
     * <p>
     * Adds the olive name, color, and amount of oil for Ligurian olives.
     *
     * @see Olive
     */
    public Ligurian() {
        super(OliveName.LIGURIAN, OliveColor.BLACK, 5);
    }

    /**
     * Gets the country of origin for the type of olive.
     * <p>
     * Overrides and implements abstract method from parent Olive class.
     *
     * @return the country of origin for the type of olive
     * @see Olive
     */
    @Override
    public String getOrigin() {
        return "Italy";
    }
}
