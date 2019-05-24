// Lynda.com Java 8 Essential Training exercise on HashMap

/*
 * Illustrates how to manage unordered data (key-value pairs) with HashMap class.
 * Creates a HashMap, adds key-value pairs and removes pair from HashMap, prints key-value pairs in HashMap format,
 * and prints specific value from HashMap.
 */
package exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Creates a HashMap object that implements the Map interface to expose Map methods.
        // Both keys and values in the Map are String types.
        Map<String, String> map = new HashMap<>();

        // Adds items to map by passing key-value pairs into put method.
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Indiana", "Indianapolis");

        // Prints key-value pairs in standard HashMap format: {key=value, key=value}.
        System.out.println("HashMap in standard format: ");
        System.out.println(map + "\n");


        // for each loop iterates over entrySet of map object and prints the entry from the Map.Entry interface.
        // Both keys and values in the Map are String types.
        System.out.println("Prints each item in HashMap:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            // Prints value and key of each key-value pair in the map object.
            System.out.println(value + ", " + key);
        }
        System.out.println("");

        // Adds items to map object by passing key-value into put method.
        map.put("Alaska", "Juneau");

        // Prints key-value pairs in standard HashMap format: {key=value, key=value}.
        System.out.println("Revised HashMap in standard format: \n" + map + "\n");

        // Accesses item in map object by passing key into get method.
        String capital = map.get("California");
        // Prints value for key passed into get method.
        System.out.println("Capital of California is " + capital + ".\n");

        // Removes item from map object by passing key into remove method.
        map.remove("California");
        // Prints key-value pairs in standard HashMap format: {key=value, key=value}.
        System.out.println("Revised HashMap in standard format: \n" + map + "\n");
    }
}
