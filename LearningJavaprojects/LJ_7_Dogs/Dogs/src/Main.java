// Lynda.com Learning Java exercise on classes and methods
// Creates Dog instance that uses the Dog class.

public class Main {
    public static void main(String[] args) {
        // Creates one dog instance.
        Dog d = new Dog("Wire-haired terrier", "Terry", 2);

        // Calls getDogYears method to calculate age of dog and prints result.
        int dogYears = d.getDogYears();
        System.out.println(d.name + ", you are " + dogYears + " years old in human years!");

        // Calls speak method.
        d.speak();
    }
}
