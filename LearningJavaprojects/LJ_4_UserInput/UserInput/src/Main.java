// Lynda.com Learning Java exercise on requesting and using user input
// Requests user input, stores input in variables, and prints to console.

// Imports Java utility library
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Constructor for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter one word: ");
        String userInput = sc.next();
        System.out.println(userInput + "? That's an odd word to input.\n");

        System.out.println("What year is it?");
        int userNumber = sc.nextInt();
        System.out.println(userNumber + "!?\n");

        System.out.println("Enter a decimal number:");
        double userNumber2 = sc.nextDouble();
        System.out.println(userNumber2 + " what?");

    }
}
