package exercises.model;

/*
 * Olive class contains the following items:
 * private variables accessible only in this class, constructor method that passes arguments.
 * getName method: returns the name of the olives.
 * getOil method: returns the amount of oil pressed from the olives.
 */
public class Olive {

    // private indicates that these instance variables are only accessible inside this class/through the methods in this class.
    // OliveName = enum
    private OliveName name = OliveName.KALAMATA;
    private long color = 0x2E0854;
    private int oil = 3;

    // Creates constructor method that matches the name of the class and accepts the instance variables as arguments.
    public Olive(OliveName name, long color, int oil) {
        // this.instance variable = argument name
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    // getName method for OliveName enum called in OlivePress class.
    public OliveName getName() {

        return name;
    }

    /* Unused setters and getters.
    public void setName(OliveName name) {
        this.name = name;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }
    */

    // Called in Main and OlivePress classes.
    public int getOil() {
        // System.out.println("Ouch!");
        return oil;
    }

    /* Unused setter.
    public void setOil(int oil) {
        this.oil = oil;
    }
    */
}
