package exercises.model;

/*
 * Olive class contains the following items:
 * private variables accessible only in this class, constructor method that passes arguments.
 * crush method: returns the amount of oil pressed from the olives.
 */
public class Olive {

    /*
    // public and static so you can refer to them from the class declaration
    public static final String KALAMATA = "Kalamata";
    public static final String LIGURIAN = "Ligurian";
    */

    // private indicates that these instance variables are only accessible inside this class/through the methods in this class.
    // OliveName and OliveColor = enums
    private OliveName name = OliveName.KALAMATA;
    private OliveColor color = OliveColor.PURPLE;
    private int oil = 3;

    // Creates constructor method that matches the name of the class and accepts the instance variables as arguments.
    public Olive(OliveName name, OliveColor color, int oil) {
        // this.instance variable = argument name
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    /* Unused getters and setters.
    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public OliveColor getColor() {
        return color;
    }

    public void setColor(OliveColor color) {
        this.color = color;
    }
    */

    // Called in OlivePress class.
    public int crush() {
        System.out.println(name + ": " + oil + " units.");
        return oil;
    }

    /* Unused setter.
    public void setOil(int oil) {
        this.oil = oil;
    }
    */

    // Overrides the toString method to return the name variable (Kalamata, Ligurian).
    public String toString() {
        return name.toString();
    }
}
