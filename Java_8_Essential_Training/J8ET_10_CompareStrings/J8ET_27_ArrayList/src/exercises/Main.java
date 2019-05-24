// Project that builds on Lynda.com Java 8 Essential Training exercise on ArrayList class

/*
 * Illustrates how to add and remove items from dynamic array with ArrayList class.
 * Creates dynamic array, adds items to and removes items from array, prints array, accesses and prints
 * specific item in array, and finds where item is located in array.
 */

package exercises;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creates an ArrayList object that implements the List interface to expose List methods.
        // ArrayList is dynamic array. Items in the collection are of the String type.
        List<String> list = new ArrayList<>();
        // Adds items to the list collection by passing string into add method.
        list.add("California");
        list.add("Washington");
        list.add("Oregon");

        // Prints array in standard format with braces.
        System.out.println("List in standard format: " );
        System.out.println(list + "\n");

        // Iterates over list collection and print values on separate lines.
        System.out.println("Prints each item in ArrayList:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("");

        // Adds item to the list collection by passing string into add method.
        list.add("Alaska");

        System.out.println("Revised list in standard format: \n" + list + "\n");

        // Removes first item in the list collection by passing the index.
        list.remove(0);

        System.out.println("Revised list in standard format: \n" + list + "\n");

        // Accesses the first item in the list collection and returns its value.
        String state = list.get(0);
        System.out.print("The first state is " + state + ". ");

        // Finds location of an item in the list collection and prints its index.
        int pos = list.indexOf("Alaska");
        System.out.println("Alaska is at position " + pos + " in the list.");
    }

}
