// Lynda.com Java 8 Essential Training exercise on arrays

/*
 * Creates, sorts, loops over int and String arrays.
 * Creates arrays with certain number of items and prints specified items.
 * Copies items from one array to another.
 */
package exercises;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Creates int array, sorts array, loops over, and prints each item in array.
        System.out.println("Array of primitives in ascending numeric order:");
        int[] intArray = {3, 1, 7};
        Arrays.sort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        System.out.println("");

        // Creates string array, sorts array, loops over, and prints each item in array.
        System.out.println("Array of strings in alphabetical order:");
        String[] strArray = {"Oscar", "Missy", "Cleo"};
        Arrays.sort(strArray);
        // for each loop iterates over strArray array (type var : array) and prints hamster.
        for (String hamster: strArray) {
            System.out.println(hamster);
        }
        System.out.println("");

        // Creates int array with 10 items, loops over array and multiples item by 100, and
        // loops over and prints each modified item in the array.
        System.out.println("Changing size of items in array:");
        // Creates int variable and assigns number of items in the array object to 10.
        int[] sized = new int[10];
        for (int i = 0; i < sized.length ; i++) {
            sized[i] =  i * 100;
        }
        for (int value: sized) {
            System.out.println(value);
        }
        System.out.println("");

        // Creates int array with 5 items, copies certain items in sized array
        // to copiedArray array, loops over copiedArray, and prints each item in the array.
        System.out.println("Copying portion of previous array:");
        int[] copiedArray = new int[5];
        // Copies sized array (starting at index 5) to copiedArray array (starting at index 0 and ending at index 4).
        System.arraycopy(sized, 5, copiedArray, 0, 5);
        // Reusing value variable because its scope is limited to the for each loop.
        for (int value: copiedArray) {
            System.out.println(value);
        }
    }
}
