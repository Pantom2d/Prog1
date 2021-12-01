package Prog1.Aufgabe6;

import java.util.Scanner;

public class IsFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter long number to check: ");
        long input = scan.nextLong();
        // long outputIt = isFactIt(input);
        long outputRec = isFactRec(input);
        
        if(outputRec == -1){
            System.out.println(input + " is not a Factorial");
        } else {
            System.out.println(input + " is a Factorial of " + outputRec);
        }
    }
    
    public static long isFactIt(long input){
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

    public static long isFactRec(long input){
        long returnValue = 1;
        int counter = 1;
        if(returnValue > input){
            return -1;
        }
        if(returnValue == input){
            return counter - 1;
        }
        returnValue *= counter;
        counter++;
        return isFactIt(input);
    }
}
