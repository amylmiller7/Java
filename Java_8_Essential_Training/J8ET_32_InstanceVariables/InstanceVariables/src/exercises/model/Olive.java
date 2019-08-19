package exercises.model;

/*
 * Olive class contains the following items:
 * private variables accessible only in this class.
 * getName method: returns the name of the olives.
 * getOil method: returns the amount of oil pressed from the olives.
 * setOil method: sets oil to the amount passed into this method.
 */
public class Olive {
    // private indicates that these instance variables are only accessible inside this class/through the methods in
    // this class.
    private String name = "Kalamata";
    private long color = 0x2E0854;
    private int oil = 3;

    // Called in OlivePress class.
    public String getName() {
        return name;
    }

    // Called in Main and OlivePress classes.
    public int getOil() {
        return oil;
    }

    // Called in Main class.
    public void setOil(int oil) {
        this.oil = oil;
    }
}
