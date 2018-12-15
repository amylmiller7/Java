# Learning Java

These projects include the following: 
* Course exercises
* Projects that build on course exercises
* My own projects that might use a few items learned in the course but mainly deviate from the course lessons

| Project | Source description |
| ------------- |-------------|
| LJ_1 | Lynda.com Learning Java initial exercise for Hello World | 
| LJ_2 | Lynda.com Learning Java exercise on classes and methods |
| LJ_3 | Lynda.com Learning Java exercise on string manipulation |
| LJ_4 | Lynda.com Learning Java exercise on requesting and using user input |
| LJ_5 | Lynda.com Learning Java exercise on creating and using arrays |
| LJ_6 | Lynda.com Learning Java exercise on string replacement |
| LJ_7 | Lynda.com Learning Java exercise on classes and methods |
| LJ_8 | Project that builds on Lynda.com Learning Java exercise on control flow (if-else statements). Checks for decimal input and converts to integer. |
| LJ_9 | Own project that requests user input, gets current year, confirms input with if-else statements, and prints message based on input. |
| LJ_10 | Lynda.com Learning Java exercise on loops |
| LJ_11 | Own project (guessing game) that compares user input with randomly generated number. |
| LJ_12 | Own project (guessing game) that compares user input with randomly generated number and allows users to play multiple times.
| LJ_13 | Lynda.com Learning Java exercise on random coin flip/debugging with print statements |
| LJ_14 | Project that builds on Lynda.com Learning Java exercise on rolling dice |
| LJ_15 | Lynda.com Learning Java exercise on inheritance |
| LJ_16 | Lynda.com Learning Java exercise on interfaces |
| LJ_17 | Lynda.com Learning Java exercise on lambda |

## LJ_1_HelloWorld
**Summary:** Prints two messages.

## LJ_2_Cars 
**Summary:** Creates Car constructor, variables, methods, and Car instances. Prints values of properties for instances. Modifies variables by calling methods and prints new results. 

**Main.java:** Creates Car instances that use the Car class. Prints values of properties for instances. Calls the changePaintColor method and prints new color. Sets speed, calls the speedingUp method, and prints new speed. 

**Car.java:** Creates Car constructor, variables, and methods used by Car instances in the Main class. Methods set a paint color and increase car speed.

## LJ_3_StringManipulation
**Summary:** Declares and assigns variable. Changes value to uppercase and prints value. Prints first character of value. Prints first character of variable as uppercase. Returns true or false depending if value contains string. 

## LJ_4_UserInput
**Summary:** Requests user input, stores input in variables, and prints to console.

## LJ_5_Arrays
**Summary:** Declares, allots, and initializes arrays. Accesses and prints values in arrays. Sorts and changes values in array. Returns the length of an array.

## LJ_6_ReplaceString
**Summary:** Changes immutable string and prints new string value to console.

## LJ_7_Dogs
**Summary:** Creates Dog constructor, variables, methods, and a Dog instance. Prints values of properties for instance. Calculates dog years and randomly returns a dog sound.

**Main.java:** Creates Dog instances that use the Dog class. Calls the getDogYears method to calculate age of Dog instance and prints result. Calls the speak method.

**Dog.java:** Creates Dog constructor, variables, and methods used by Dog instance in the Main class. Methods calculate dog years, randomize items in array, and print random item in the sound array.

## LJ_8_Age
**Summary:** Requests user input. Checks if input is decimal and converts to integer. Uses if-else statement to print different message based on input.

## LJ_9_BirthYear
**Summary:** Requests user input and stores as variable. Gets current year to compare against input and stores in variable. Checks input against if-else statement and prints different message based on input.

## LJ_10_Loops
**Summary:** Creates three types of loops: while, do-while, for. Prints value at each iteration of the loop.

## LJ_11_Randomizer
**Summary:** Requests user input and stores input as variable. Generates random number between 1 and 5 and stores number as a variable. Checks if user input and random number match and prints a message.

## LJ_12_RandomizerRepeat
**Summary:** Requests user input and stores input as variable. Generates random number between 1 and 5 and stores number as a variable. Checks if user input and random number match and prints a message. Allows users to play multiple times, keeps track of number of guesses, and prints number of guesses if/when user input matches random number.

**Main.java:** Uses loop to call inputGuess method in Guess class, check if user wants to play the game again, and track the number of times played/guesses made. Prints message if user no longer wants to play.

**Guess.java:** Creates inputGuess method that assigns user input to a variable, generates a random number, compares the user input and the random under, and prints message if numbers match or not. If the numbers match, returns number of guesses from Main class.

## LJ_13_FlipCoin
**Summary:** Creates Coin constructor, variables, methods, and a Coin instance. Flips coin randomly 10 times. Prints out results of coin flips.

**Main.java:** Creates Coin instance that uses the Coin class. Loops 10 times to call the flip method, to call the getFaceUp method, and to print coin flip.

**Coin.java:** Creates Coin constructor, variables, and methods used by Coin instance in the Main class. Variables set to output HEADS or TAILS and coin flip outcome. Methods flip coin and return result of coin flip.

## LJ_14_RollDice
**Summary:** Rolls two dice. Prints the result of each dice roll and the total.

**Main.java:** Creates Coin instance that uses the Coin class. Calls the roll method and prints the result.

**Dice.java:** Creates Dice constructor, variables, and method used by Dice instance in the Main class. Variables set to random numbers between 1 and 6. Method calculates the sum of the two dice. 

## LJ_15_Insects
**Summary:** Creates Insect, Spider, and Cricket constructors, variables, and methods. Spider and Cricket inherit variables and methods from Spider, overwrite some of the methods and/or add their own methods.

**Main.java:** Creates Insect, Spider, and Cricket instances that use the Insect, Spider, and Cricket classes. Calls methods inherited from the Insect class and method unique to the Cricket class. Prints variables unique to Spider and Cricket classes.

**Insect.java:** Creates Insect constructor, variables, and methods used by Insect instance or any other instances that inherit the Insect class. Methods print strings to the console.

**Spider.java:** Creates Spider constructor, variables, and methods. Inherits variables and methods from Insect class. Adds unique variable and overwrites method outputs.

**Cricket.java:** Creates Cricket constructor, variables, and methods. Inherits variables and method from Insect class. Adds unique variable and method. Overwrites inherited method output.

## LJ_16_Pets
**Summary:** Creates Pet, Dog, and Cat constructors and a method. Calls method in the Pet interface for Dog and Cat instances. Randomly assigns Dog or Cat instance and calls the play method on the appropriate class.

**Main.java:** Creates Pet, Dog, and Cat instances. Dog and Cat classes implement the Pet class and print unique messages for the method under the Pet class. Randomly returns Pet instance, sets it as Dog or Cat, and calls the method for the assigned pet type.

**Pet.java:** Creates interface with single method and no parameters.

**Dog.java:** Implements the Pet interface. Uses the play method to print message for Dog class.

**Cat.java:** Implements the Pet interface. Uses the play method to print message for Cat class.

## LJ_17_Lambda
**Summary:** Uses lambda expressions instead of anonymous classes. Creates Answerable and Predicate interfaces with functions that return a string and a boolean.

**Main.java:** Creates Answerable and Predicate variables set to lambda expressions. Prints results of expressions.

**Answerable.java:** Creates Answerable interface with variable used in lambda expression in Main class.

**Predicate.java:** Creates Predicate interface with variable used in lambda expression in Main class.

## Project folders contain:  
* Java project
* README documentation