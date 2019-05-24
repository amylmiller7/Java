// Lynda.com Java 8 Essential Training exercise on passing arguments as copies

/*
 * Illustrates changes to variables when they are passed into methods and overloaded methods.
 * Original values do NOT change for primitive values or strings.
 * Original values DO change for primitives wrapped on complex objects likes arrays.
 */
package exercises;

public class Main {

    public static void main(String[] args) {

        // Example: Passing primitive values > original value does not change.
        System.out.println("Original primitive type value does NOT CHANGE when value passed to method.");
        int original = 10;
        // Prints 10.
        System.out.println("Original primitive value before: " + original);
        // Outputs 11.
        incrementValue(original);
        // Prints 10.
        System.out.println(("Original primitive value after: " + original));
        System.out.println(" ");

        //Example: Primitives wrapped in complex objects > original value changes.
        System.out.println("Primitives wrapped in complex objects (array). Original primitive type value does CHANGE when value passed to method.");
        int[] arOriginal = {10, 20, 30};
        // Prints 10.
        System.out.println("Original value of first item in array before: " + arOriginal[0]);
        // Outputs 11.
        incrementValue(arOriginal);
        // Prints 11.
        System.out.println(("Original value of first item in array after: " + arOriginal[0]));
        System.out.println(" ");

        // Example: Pass string values > original value does not change even though strings are complex objects.
        System.out.println("Strings as complex objects. Original string value does NOT CHANGE when value passed to method.");
        String originalStr = "Original!";
        // Prints "Original!".
        System.out.println("Original string before: " + originalStr);
        // Outputs "New!".
        changeString();
        // Prints "Original!".
        System.out.println(("Original string after: " + originalStr));

    }

    static void changeString() {
        String inMethod = "New!";
        System.out.println("In method value: " + inMethod);
    }

    static void incrementValue(int inMethod) {
        inMethod ++;
        System.out.println(("In method value: " + inMethod));
    }

    // Overloaded method.
    static void incrementValue(int[] inMethod) {
        inMethod[0] ++;
        System.out.println(("In method value: " + inMethod[0]));
    }

}
