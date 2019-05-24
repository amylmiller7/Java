// Project that builds on Lynda.com Java 8 Essential Training exercise on string arrays

/*
 * Creates string array, finds last item in array, and prints last item.
 */

package exercises;

public class Main {

    public static void main(String[] args) {

        String[] array = {"Oscar", "Missy", "Cleo"};
        String lastItem = array[array.length -1];
        System.out.println("My last hamster was named " + lastItem + ".");
    }
}
