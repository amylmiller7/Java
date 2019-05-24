// Lynda.com Java 8 Essential Training exercise on iterating over collections

/*
 * Prints ordered data (ArrayList) and unordered data (HashMap).
 * Prints individual items in ordered data and unordered data by iterating over data collections.
 * For ordered data: iterates with iterator object and while loop, for each loop, and method reference.
 * For unordered data: iterates with iterator object and while loop.
 */
package exercises;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ordered data (ArrayList):");
        // Creates an ArrayList object that implements the List interface.
        // Items in the collection are of the String type.
        List<String> list = new ArrayList<>();
        // Adds item to list collection by passing string into add method.
        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        // Prints array in standard format with braces.
        System.out.println("List in standard format:");
        System.out.println(list + "\n");

        // Loops over collection with Iterator object.
        System.out.println("ArrayList iterator:");
        // Iterates over list collection by implementing the Iterator interface.
        // Items in collection are of the String type.
        Iterator<String> iterator = list.iterator();
        // Passes iterator object as long as list contains another item.
        while (iterator.hasNext()) {
            // Declares variable to store each list item.
            String value = iterator.next();
            // Prints each list item.
            System.out.println(value);
        }
        System.out.println("");

        // Loops over collection with for each loop.
        System.out.println("ArrayList for each:");
        // for each loop iterates over list collection (type var : array).
        for (String value: list) {
            // Prints each list item.
            System.out.println(value);
        }
        System.out.println("");

        // Loops over collection with for each loop. Prints with method reference.
        System.out.println("Java 8 method reference:");
        list.forEach(System.out::println);
        System.out.println("");

        // Loops over unordered data in HashMap.
        System.out.println("Unordered data (HashMap):");
        // Creates a HashMap object that implements the Map interface. Both key and values are String types.
        Map<String, String> map = new HashMap<>();
        // Adds items to the map object by passing key-value pairs into put method.
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        // Prints key-value pairs in HashMap format: {key=value, key=value}.
        System.out.println(map);
        System.out.println("");

        // Loops over collection with HashMap Iterator object.
        System.out.println("HashMap Iterator:");
        // Gets values of keys from map object by implementing the Set interface. Keys are of the String type.
        Set<String> keys = map.keySet();
        // Iterates over keys by implementing the Iterator interface. Keys are fo the String type.
        Iterator<String> iterator1 = keys.iterator();
        // Passes iterator object as long as map contains another item.
        while (iterator1.hasNext()) {
            // Declares variable to store each map item.
            String key = iterator1.next();
            // Prints each key from map along with value with get method.
            System.out.println("The capital of " + key + " is " + map.get(key) + ".");
        }
        System.out.println("");
    }
}
