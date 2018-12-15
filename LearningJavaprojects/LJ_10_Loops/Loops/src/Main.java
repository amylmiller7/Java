// Lynda.com Learning Java exercise on loops

public class Main {

    public static void main(String[] arg) {

        // While loop
        System.out.println("While loop");
        int x = 3;
        while (x > 0) {
            System.out.println("Current x: " + x);
            x = x - 1;
        }
        System.out.println("Final x: " + x);
        System.out.println();

        // do-while loop
        System.out.println("Do-While Loop");
        int y = 3;
        do {
            System.out.println("Current y: " + y);
            y = y -1;
        } while(y > 0);
        System.out.println("Final y: " + y);
        System.out.println();

        System.out.println("For loop");
        for(int i = 3; i > 0; i--) {
            System.out.println("Current i: " + i);
        }
        System.out.println();
    }

}
