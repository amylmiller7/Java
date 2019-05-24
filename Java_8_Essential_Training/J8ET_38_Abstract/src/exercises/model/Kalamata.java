package exercises.model;

/*
 * Subclass of Olive class that implements abstract method getOrigin in the Olive class.
 * Implements abstract method getOrigin in the Olive class.
 */
public class Kalamata extends Olive {

    // Creates constructor method that matches the name of the class.
    public Kalamata() {
        // Calls the superclass (Olive class) and passes the three arguments (two of which are their own classes)
        // required by the Olive class.
        super(OliveName.KALAMATA, OliveColor.PURPLE, 2);
    }

    // Overrides and implements abstract method getOrigin of parent (Olive class).
    @Override
    public String getOrigin() {
        return "Greece";
    }
}
