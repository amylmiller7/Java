package exercises.model;

// Subclass of the Olive class that implements abstract method getOrigin.

/**
 * Defines the characteristics of Kalamata olives (name, color, origin, amount of oil pressed from this type of olive).
 * <p>
 * Sets olive name, color, and amount of oil pressed of this type of olive. Returns origin of Kalamata olives.
 */
public class Kalamata extends Olive {

    /**
     * Creates and initializes a new Kalamata olive.
     * <p>
     * Adds the olive name, color, and amount of oil for Kalamata olives.
     *
     * @see Olive
     */
    public Kalamata() {
        super(OliveName.KALAMATA, OliveColor.PURPLE, 2);
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
        return "Greece";
    }
}
