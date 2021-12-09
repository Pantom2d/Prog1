package Prog1.Aufgabe4;

import java.util.Arrays;
import java.util.Random;

public class Yahtzee {
    public static void main(String[] args) {
        int counter = 0;
        while (true){
            int[] currentArray = getAllDiceValues();
            if (isSmallStraight(currentArray)) {
                printWinningArray(currentArray);
                break;
            }
            counter++;
        }
        System.out.println("Number of Attempts needed: " + counter + 1);
    }

    public static int getSingleDiceRoll() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static void printWinningArray(int[] array) {
        System.out.println("Winning Array: " + Arrays.toString(array));
    }

    public static int[] getAllDiceValues() {
        int NUMBER_OF_ROLLS = 5;
        int[] array = new int[NUMBER_OF_ROLLS];
        for (int i = 0; i < array.length; i++){
            array[i] = getSingleDiceRoll();
        }
        return array;
    }

    public static boolean isSmallStraight(int[] diceRolls) {
        return (diceRolls[0] == diceRolls[1]) && (diceRolls[0] == diceRolls[2]) && (diceRolls[0] == diceRolls[3]) ||
                ((diceRolls[1] == diceRolls[2]) && (diceRolls[1] == diceRolls[3]) && (diceRolls[1] == diceRolls[4]));
    }
}
