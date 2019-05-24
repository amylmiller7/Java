package exercises;

import exercises.model.Olive;
import java.util.List;

/*
 * Press is the interface (contract or blueprint) that defines the set of abstract methods to be used in the application,
 * but keeps implementation of the methods private. Cannot be instantiated, only implemented by other classes.
 * Any class implementing this interface must include these methods.
 */

/**
 * Defines the abstract methods (getOil, setOil) used by other classes in the application.
 * <p>
 * Sets the amount of oil and gets the amount of oil pressed from olives.
 *
 * @see OlivePress#getOil
 */
public interface Press {

    /**
     * Gets the amount of oil pressed from the collection of olives.
     *
     * @param olives  the collection of olives
     */
    int getOil(List<Olive> olives);

    /**
     * Sets the amount of oil.
     *
     * @param oil  the amount of oil
     */
    void setOil (int oil);
}
