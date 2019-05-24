// Lynda.com Java 8 Essential Training exercise on multidimensional arrays

/*
 * Illustrates how to use two-dimensional arrays for ordered data.
 * One array stores state names. Other array stores state capital names.
 * Creates arrays, allots memory, sets values, oops over array length to add items to string object, and
 * print string object.
 */
package exercises;

public class Main {

    public static void main(String[] args) {
        // Creates objects of two-dimensional arrays with new constructor method and sets size of both arrays,
        // which allots memory for the arrays.
        String[][] states = new String[3][3];
        // Sets values for items in arrays.
        states[0][0] = "California";
        states[0][1] = "Sacramento";
        states[1][0] = "Indiana";
        states[1][1] = "Indianapolis";
        states[2][0] = "Oregon";
        states[2][1] = "Salem";

        // for loop iterates the length of the outer array.
        for (int i = 0; i < states.length; i++) {
            // Creates object of the StringBuilder class with new constructor method to store data from looping.
            StringBuilder sb = new StringBuilder();
            // Adds items to StringBuilder object.
            sb.append("The capital of ")
                    .append(states[i][0])
                    .append(" is ")
                    .append(states[i][1])
                    .append(".");
            // Prints the state and capital of each item in the arrays.
            System.out.println(sb);
        }
    }
    
}
