package Prog1.Aufgabe5;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Prime Number to check: ");
        int numberToCheck = scan.nextInt();
        if(isPrime(numberToCheck))
            System.out.println(numberToCheck + " is prime!");
        else{
            System.out.println(numberToCheck + " is not prime!");
        }
        
    }

    public static boolean isPrime(int number){
        for (int i = 2; i < number/2; i++){
            if (number % i == 0)
            return false;
        }
        return true;
    }
}
