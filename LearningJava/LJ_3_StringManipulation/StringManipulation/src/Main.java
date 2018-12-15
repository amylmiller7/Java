// Lynda.com Learning Java exercise on string manipulation
// Changes value of variable and prints out.

public class Main {
    public static void main(String[] args) {
        // Declare and assign variable.
        String userInput = "entertainment";

        // Changes value to uppercase and prints out.
        String uppercased = userInput.toUpperCase();
        System.out.println(uppercased);

        // Prints out first character of value.
        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        // Prints out first character of value as uppercase.
        char firstCharacterUpper = uppercased.charAt(0);
        System.out.println(firstCharacterUpper);

        // Returns true or false depending if value contains string.
        System.out.println("Contains: " + userInput.contains("men"));
    }
}
