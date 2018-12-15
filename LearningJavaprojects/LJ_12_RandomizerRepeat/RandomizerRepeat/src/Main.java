/*
Own project (guessing game) that compares user input with randomly generated number and allows users to play multiple times. Not an exercise for Lynda.com Learning Java course.
Contains loop to check if user wants to play again and track the number of times played/guesses made.
*/

import java.util.Scanner;

public class Main {
    // Creates variable to count the number of guesses made;
    public static long count = 0;

    public static void main(String[] args) {
        String playAgain = "";
        Scanner input = new Scanner(System.in);
        System.out.println("You vs. The Randomizer\nLet's see if you can guess what The Randomizer will return.");

        // Checks if user wants to continue to play and increments the number of guesses made.
        do {
            // Increments the number of guesses made.
            count++;
            // Calls inputGuess method in Guess class.
            Guess.inputGuess();
            System.out.println("\nWould you like to play again? Enter Y or N.");
            // Sets variable to user input (Y or N).
            playAgain = input.nextLine();
        }
        // Checks that input equals Y or y.
        while (playAgain.equalsIgnoreCase("Y"));

        // If input is not Y or y, returns message and program ends.
        System.out.println("\nThanks for playing!");

    }
}