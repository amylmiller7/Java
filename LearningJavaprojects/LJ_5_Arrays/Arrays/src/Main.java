// Lynda.com Learning Java exercise on creating and using arrays
// Declares, allots, and initializes arrays. Accesses and prints values in arrays. Sorts and changes values in array. Returns the length of an array.

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Declares int array.
        // int[] numbers;

        // Declares int array and allots 5 slots for array.
        int[] numbers = new int[5];
        // Initializes array slots individually.
        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;

        // Declares, allots, and initializes at same time.
        int[] numbers2 = {31, 45, 22, 98, 10};
        // Prints value in array.
        System.out.println(Arrays.toString(numbers2));
        System.out.println("Original 3rd item: " + numbers2[2]);

        // Sorts values in array.
        Arrays.sort(numbers2);
        System.out.println("\n" + Arrays.toString(numbers2));
        System.out.println("Post-sort 3rd item: " + numbers2[2] + "\n");

        String[]  myHamsters = {"Oscar", "Missy", "cleo"};
        // Accesses and prints items in array.
        System.out.println("My first hamster: " + myHamsters[0]);
        // Changes value.
        System.out.println(myHamsters[2]);
        myHamsters[2] = "Cleo";
        System.out.println(myHamsters[2]);

        // Prints length of array.
        System.out.println("Array length: " + myHamsters.length);

        // Array class, not instance of class, calling the array and printing value.
        System.out.println(Array.get(myHamsters, 2));
    }
}
