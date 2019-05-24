package exercises.model;

/*
 * Abstract class contains abstract methods that are implemented in subclasses.
 * private variables accessible only in this class, constructor method that passes parameters.
 * crush method: prints message with name and oil variables and by calling getOrigin method. Returns oil.
 * getOrigin method: abstract method implemented in subclasses Kalamata and Ligurian.
 */

// Abstract class contains abstract methods that are implemented in subclasses.
public abstract class Olive {

    // private indicates that these instance variables are only accessible inside this class/through the methods in this class.
    // OliveName and OliveColor = name of other classes.
    private OliveName name;
    private OliveColor color;
    private int oil;

    // Creates constructor method that matches the name of the class and accepts the instance variables as arguments.
    public Olive(OliveName name, OliveColor color, int oil) {
        // this.instance variable = argument name. Assigns instance variables to this method's arguments.
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public int crush() {
        String msg = name + " (from " + getOrigin() + ") produced " + oil + " units of oil.";
        System.out.println(msg);
        return oil;
    }

    // Abstract method that is implemented (code executed) in Kalamata and Ligurian classes.
    public abstract String getOrigin();

}
