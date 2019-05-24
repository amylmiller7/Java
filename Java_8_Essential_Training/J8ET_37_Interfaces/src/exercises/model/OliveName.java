package exercises.model;

/*
 * OliveName class contains the following items:
 * Enums for olive names, private variable accessible only in this class, constructor method that passes parameter.
 * toString method: returns the translated enum.
 */
public enum OliveName {
    // Lists enums and passes strings used to translate enums.
    KALAMATA("Kalamata"),
    LIGURIAN("Ligurian");

    // private indicates that this instance variable is only accessible inside this class/through the methods in this class.
    // Creates a name variable so name of enum (KALAMTA, LIGURIAN) can be translated into the value (Kalamata, Ligurian).
    private String name;

    // Creates constructor method that matches the name of the enum list and accepts translated enum.
    OliveName(String name) {
        //  this.instance variable = argument name. Assigns instance variables to this method's arguments.
        this.name = name;
    }

    // Overrides the toString method to return the name variable (Kalamata, Ligurian).
    public String toString() {
        return name;
    }

}