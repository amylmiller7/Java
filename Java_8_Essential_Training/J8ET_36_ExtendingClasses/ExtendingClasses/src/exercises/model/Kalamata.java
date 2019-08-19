package exercises.model;

/*
 * Subclass of Olive class (i.e., extends Olive class). Constructor calls Olive class constructor and passes arguments.
 */
public class Kalamata extends Olive {

    // Creates no argument constructor for this subclass, which is called in Main class.
    public Kalamata() {
        // Calls parent class (Olive) constructor that accepts three arguments.
        super(OliveName.KALAMATA, OliveColor.PURPLE, 2);
    }
}
