# RandomizerRepeat

**Java files:** 
* Main.java
* Guess.java

**Source description:** Own project (guessing game) that compares user input with randomly generated number and allows users to play multiple times.

**Summary:** Requests user input and stores input as variable. Generates random number between 1 and 5 and stores number as a variable. Checks if user input and random number match and prints a message. Allows users to play multiple times, keeps track of number of guesses, and prints number of guesses if/when user input matches random number.

**Main.java:** Uses loop to call inputGuess method in Guess class, to check if user wants to play the game again, and to track the number of times played/guesses made. Prints message if user no longer wants to play.

**Guess.java:** Creates inputGuess method that assigns user input to a variable, generates a random number, compares the user input and the random under, and prints message if numbers match or not. If the numbers match, returns number of guesses from Main class.

Date: December 2018