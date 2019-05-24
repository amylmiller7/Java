package exercises;

import exercises.model.Olive;
import java.util.List;

/*
 * Press interface
 * Contract or blueprint that defines a set of abstract methods to be used, but keeps implementation of methods private.
 * Cannot be instantiated, only implemented by other classes.
 */
public interface Press {

    // Method signatures copied into OlivePress class.
    // Any class implementing this interface must have these methods.
    int getOil(List<Olive> olives);
    void setOil (int oil);
}
