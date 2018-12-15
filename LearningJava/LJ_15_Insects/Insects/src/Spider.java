// Lynda.com Learning Java exercise on inheritance
// Creates Spider class that inherits from Insect class.

public class Spider extends Insect {
    // Variable for Spider class.
    boolean isPoisonous;

    // Constructor that initializes Spider instances.
    public Spider(int age, boolean isPoisonous) {
        // Variables inherited from Insect class
        super(age, 8);
        // Variable unique to Spider class
        this.isPoisonous = isPoisonous;
    }

    // Method inherited from Insect class but output overwritten.
    public void crawl() {
        System.out.println("The spider spun a web.");
    }

    // Method inherited from Insect class but output overwritten.
    public void says() {
        System.out.println("HISSSS");
    }
}