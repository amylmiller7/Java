// Lynda.com Learning Java exercise on inheritance
// Creates Insect constructor, variables, and methods used by Insect class and other classes that inherit the Insect class.

public class Insect {
    // Variables for Insect class.
    int age;
    int numberOfLegs;

    // Constructor that initializes Insect instances.
    public Insect(int age, int numberOfLegs) {
        this.age = age;
        this.numberOfLegs = numberOfLegs;
    }

    public void says() {
        System.out.println("...");
    }

    public void crawl() {
        System.out.println("The insect crawled.");
    }
}