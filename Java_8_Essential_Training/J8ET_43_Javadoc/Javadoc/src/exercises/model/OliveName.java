package exercises.model;

/**
 * Provides the names of olives.
 */
public enum OliveName {
    // Lists enums and passes strings used to translate enums.
    /**
     * Constant for the olive name Kalamata.
     */
    KALAMATA("Kalamata"),
    /**
     * Constant for the olive name Ligurian.
     */
    LIGURIAN("Ligurian");

    // private indicates that this instance variable is only accessible inside this class/through the methods in this class.
    // Creates a name variable so name of enum (KALAMTA, LIGURIAN) can be translated into the value (Kalamata, Ligurian).
    private String name;

    // Creates constructor method that matches the name of the enum list and accepts translated enum.
    /**
     * Creates and initializes OliveName with appropriate olive name.
     *
     * @param name  the color name
     */
    OliveName(String name) {
        //  this.instance variable = argument name. Assigns instance variables to this method's arguments.
        this.name = name;
    }

    /**
     * Converts the enum to a string.
     *
     * @return  the enum as a string
     */
    public String toString() { return name; }

}