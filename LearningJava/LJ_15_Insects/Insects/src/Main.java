// Lynda.com Learning Java exercise on inheritance
// Creates Insect, Spider, and Cricket instances. Spider and Cricket instances inherit from Insect class.

public class Main {
    public static void main(String[] args) {
        // Constructors for Insect, Spider, Cricket instances.
        Insect insect = new Insect(5, 6);
        Spider spider = new Spider(13, true);
        Cricket cricket = new Cricket(2, 1.25);

        // Calls methods on insect instance.
        insect.crawl();
        insect.says();

        // Calls methods on spider instance that are inherited from Insect class but overwritten.
        spider.crawl();
        spider.says();
        if(spider.isPoisonous == true) {
            System.out.println("Watch out! I am poisonous.");
        } else {
            System.out.println("Don't hurt me! I'm not poisonous.");
        }

        // Calls methods on cricket instance that are inherited from Insect class and unique to Cricket class.
        cricket.crawl();
        cricket.says();
        cricket.jump();
        System.out.println(cricket.length);
    }
}