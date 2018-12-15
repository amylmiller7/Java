// Project that builds on Lynda.com Learning Java exercise on rolling dice
// Creates Dice constructor, variables, and method used by Dice instance in the Main class.

public class Dice {

    public Dice() {
        roll();
    }

    int dice1 = (int) (Math.random() * 6 + 1);
    int dice2 = (int) (Math.random() * 6 + 1);

    public int roll() {
        int sum = dice1 + dice2;
        return sum;
    }


}
