package exercises.model;

/*
 * Subclass of Olive class (i.e., extends Olive class). Constructor calls Olive class and passes arguments.
 */
public class Ligurian extends Olive {

    // Creates no argument constructor for this subclass, which is called in Main class.
    public Ligurian() {
        // Calls parent class (Olive) and passes the three arguments (two of which are their own classes)
        // required by the Olive class.
        super(OliveName.LIGURIAN, OliveColor.BLACK, 5);
    }
}
