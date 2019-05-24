// Lynda.com Java 8 Essential Training exercise on methods

/*
 * Illustrates how to declare custom methods that accept values as arguments and execute code based on these arguments.
 */
package exercises;

public class Main {

    // Static indicates a class-level variable, i.e., shared between all instances of the class.
    static String[] months = {"January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"};

    // Main method calls custom loopIt method.
    public static void main(String[] args) {

        loopIt("Month of the year");
    }

    // Custom method.
    // Static indicates method can be called without creating object/instances of class.
    static void loopIt(String label) {
        System.out.println(label);
        // Prints line of asterisks the same length as label.
        for (int i = 0; i < label.length(); i++) {
            System.out.print("*");
            
        }
        System.out.println("");

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);

        }
    }
}
