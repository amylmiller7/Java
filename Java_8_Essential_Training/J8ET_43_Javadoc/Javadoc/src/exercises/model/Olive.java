package exercises.model;

import exercises.OlivePress;

/*
 * Abstract class contains abstract methods that are implemented in subclasses (Kalamata and Ligurian).
 * private variables accessible only in this class, constructor method that passes parameters.
 * crush method: prints message with name and oil variables and by calling getOrigin method. Returns oil.
 * getOrigin method: abstract method implemented in subclasses Kalamata and Ligurian.
 */

/**
 * Defines the characteristics of olives (name, color, origin, amount of oil).
 * <p>
 * Creates variables for olive names, colors, and oil and passes them to each olive. Gets and sets olive names.
 * Creates crush method called in OlivePress class.
 */
public abstract class Olive {

    // Instance variables of the olive name, color, and oil associated with each olive. Only accessible inside this class.
    private OliveName name;
    private OliveColor color;
    private int oil;

    // Constructor method for each olive.

    /**
     * Creates and initializes a new Olive with the appropriate olive name, color, and amount of oil.
     *
     * @param name   the type of olive
     * @param color  the color of olive
     * @param oil    the amount of oil produced when olive is pressed
     */
    public Olive(OliveName name, OliveColor color, int oil) {
        // Assigns instance variables to this method's arguments.
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    /**
     * Gets the name of the type of olive.
     *
     * @return the name of the type of olive
     */
    public OliveName getName() {
        return name;
    }

    /**
     * Creates the name of the type of olive.
     *
     * @param name  the name of the type of olive
     */
    public void setName(OliveName name) {
        this.name = name;
    }

    /* getters and setters
    public OliveColor getColor() {
        return color;
    }

    public void setColor(OliveColor color) {
        this.color = color;
    }
    */

    /**
     * Prints the olive name, origin, and amount of oil produced from a particular olive.
     *
     * @return the amount of oil produced from a particular olive
     * @see OlivePress
     */
    public int crush() {
        String msg = name + ", from " + getOrigin() + ": " + oil + " units";
        System.out.println(msg);
        return oil;
    }

    /**
     * Sets the amount of oil produced from olives.
     *
     * @param oil  the amount of oil produced from olives
     */
    public void setOil(int oil) {
        this.oil = oil;
    }

    /**
     * Gets the country of origin of the type of olive. Abstract method implemented in subclasses.
     *
     * @see Kalamata
     * @see Ligurian
     */
    public abstract String getOrigin();

    /**
     * Converts the enum of olive name to string.
     *
     * @return the enum as a string
     */
    // Overrides the toString method to return the name variable (Kalamata, Ligurian).
    public String toString() {
        return name.toString();
    }
}
