package Prog1.Aufgabe5;
import java.util.Scanner;

public class Potencies {
    public static void main(String[] args) {
        int[] testNumber = getNumber();
        System.out.println("By iteration: " + calculateIterativ(testNumber));
        System.out.println("By recursion: " + calculateRecursive(testNumber));

    }
    public static int[] getNumber(){
        int[] number = new int[2];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Bases");
        number[0] = s.nextInt();
        System.out.println("Enter Exponent");
        number[1] = s.nextInt();

        return number;
    }
    public static int calculateIterativ(int[] input){
        int exponent = input[1];
        int result = input[0];
        for(int i = 0; i < exponent-1; i++){
            result *= input[0];
        }

        return result;
    }
    public static int calculateRecursive(int[] input) {
        if (input[1] < 1) 
            return 1; 
        else
            input[1]--;
            return input[0] * calculateRecursive(input);
    }
    
}
