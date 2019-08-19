// Lynda.com Java 8 Essential Training exercise on loops

/*
 * Loops through and prints collection of data using different methods: for loop, for loop reverse order,
 * for each loop, while loop, do while loop.
 */
package exercises;

public class Main {

    public static void main(String[] args) {

        String[] months = {"January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"};

        /* #1 method: for loop
        // Prints items in months array with for loop.
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        */

        /* #2 method: for loop reverse
        // Prints items in months array in reverse order with for loop.
        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);
        }
        */

        /* #3 method: for each loop
        // Prints items in months array with for each loop (type var : array).
        for (String month : months) {
            System.out.println(month);
        }
        */

        /* #4 method: while loop
        // Prints items in months array with while loop: while condition exists, print item, and then increment.
        // ORDER OF EXECUTION MATTERS.
        int counter = 0;
        while (counter < months.length) {
            System.out.println(months[counter]);
            counter++;
        }
        */

        // #5 method: do while loop
        // Prints items in months array with do while loop: print item, increment, then check condition.
        // ORDER OF EXECUTION MATTERS.
        int counter = 0;
        do {
            System.out.println(months[counter]);
            counter++;
        } while (counter < months.length);

    }
}
