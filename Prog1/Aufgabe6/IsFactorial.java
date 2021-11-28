package Prog1.Aufgabe6;

import java.util.Scanner;

public class IsFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter long number to check: ");
        long input = scan.nextLong();
        long output = isFact(input);
        
        if(output == -1){
            System.out.println(input + " is not a Factorial");
        } else {
            System.out.println(input + " is a Factorial of " + output);
        }

        
    }
    
    public static long isFact (long input){
        long returnValue = 1;
        for(int i = 1; i < Long.MAX_VALUE; i++){
            if(returnValue > input){
                return -1;
            }
            if(returnValue == input){
                return i - 1;
            }
            returnValue *= i;
        }
        return -1;
    }
}
