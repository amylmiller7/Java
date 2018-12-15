// Lynda.com Learning Java exercise on lambda

public class Main {
    public static void main(String[] args) {

        // Sets variable called phone to the value of function. Maps to signature string Answerable.
        Answerable phone = () -> "Hello";

        System.out.println(phone.answer());

        // Sets variable called isOdd. Predicate links lambda implementation to the test function signature.
        Predicate isOdd = n -> n % 2 != 0;
        System.out.println(isOdd.test(2));

        Predicate isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(2));
    }
}
