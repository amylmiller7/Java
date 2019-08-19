package exercises.model;

/*
 * OliveColor class contains the following items:
 * Enums for olive colors, variables, constructor method that passes parameters.
 * toString method: returns the translated enum.
 */
public enum OliveColor {
    // Lists enums and passes strings used to translate enums.
    PURPLE("Purple", 0x3E0854),
    BLACK("Black", 0x000000),
    GREEN("Green", 0x00FF00);

    // Creates variables so name and color of enums (e.g., KALAMTA, LIGURIAN) can be translated into the value
    // (e.g., Kalamata, Ligurian).
    String name;
    long color;

    // Creates constructor method that matches the name of the enum list and accepts translated enum.
    OliveColor(String name, long color) {
        // this.instance variable = argument name. Assigns instance variables to this method's arguments.
        this.name = name;
        this.color = color;
    }

    // Overrides the toString method to return the name variable (Kalamata, Ligurian).
    public String toString() {
        return name;
    }
}
