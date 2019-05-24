package exercises.model;

/*
 * Olive class contains the following items:
 * Constants for olive names, private variables accessible only in this class, constructor method that passes parameters.
 * getName method: returns the name of the olives.
 * getOil method: returns the amount of oil pressed from the olives.
 */
public class Olive {
    // final indicates these are constants that cannot be changed. Referenced in the Main class.
    public static final String KALAMATA = "Kalamata";
    public static final String LIGURIAN = "Ligurian";

    // private indicates that these instance variables are only accessible inside this class/through the methods in this class.
    private String name;
    private long color;
    private int oil;

    // Creates constructor method that matches the name of the class and accepts the instance variables as arguments.
    public Olive(String name, long color, int oil) {
        //  this.instance variable = argument name. Assigns instance variables to this method's arguments.
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    // Called in OlivePress class.
    public String getName() {
        return name;
    }

    // Called in Main and OlivePress classes.
    public int getOil() {
        // System.out.println("Ouch!");
        return oil;
    }
}
