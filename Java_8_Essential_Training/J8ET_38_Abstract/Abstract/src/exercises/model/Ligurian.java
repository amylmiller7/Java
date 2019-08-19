package exercises.model;

/*
* Subclass of Olive class (i.e., extends Olive class). Constructor calls Olive class and passes arguments.
 * Implements abstract method getOrigin in the Olive class.
 */
public class Ligurian extends Olive {

    // Creates no argument constructor for this subclass, which is called in the Main class.
    public Ligurian() {
        // Calls the superclass (Olive) and passes the three arguments (two of which are their own classes)
        // required by the Olive class.
        super(OliveName.LIGURIAN, OliveColor.BLACK, 5);
    }

    // Overrides and implements abstract method getOrigin of parent (Olive class).
    @Override
    public String getOrigin() {
        return "Italy";
    }
}
