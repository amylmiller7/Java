package exercises.model;

/*
 * Subclass of Olive class (i.e., extends Olive class). Constructor calls Olive class constructor and passes arguments.
 */
public class Ligurian extends Olive {

    // Creates no argument constructor for this subclass, which is called in Main class.
    public Ligurian() {
        // Calls parent class (Olive) constructor that accepts three arguments.
        super(OliveName.LIGURIAN, OliveColor.BLACK, 5);
    }
}
