package Prog1.Aufgabe4;

public class Factorial {    
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }
    public static long factorial (int input){
        long result = 1;

        for (int factor = 2; factor <= input; factor++) {
            result *= factor;
        }
        if (result > Integer.MAX_VALUE || result < 0)
            return Integer.MIN_VALUE;

        return result;
    }   
}