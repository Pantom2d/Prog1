package Prog1.Aufgabe5;

import java.io.IOException;
import java.util.Arrays;

public class Palindrom {
    public static void main(String[] args) throws IOException {

        char[] someText = getArrayFromConsole();
        System.out.println(Arrays.toString(someText));
        boolean isPalindrome = isPalindromIterative(someText);

        if(isPalindrome)
            System.out.println("Given input is a Palindrom!");
        else{
            System.out.println("Given input is not a Palindrom!");
        }

    
    }
    public static char[] getArrayFromConsole() throws IOException{

        char[] input = new char[50];
        int counter = 0;
        System.out.println("Enter String for Palindrom check (max 50 Characters): ");

        while(true){
            char c = (char)System.in.read();
            if(c == '\n' || c == '\r')
                break;
            
            input[counter] = c;
            counter++;
        }
        char[] output = new char[counter];
        for (int i = 0; i < output.length; i++){
            output[i] = input[i];
        }

        return output;
    }
    public static boolean isPalindromIterative(char[] input){
        int len = input.length;
        int j = len - 1;
        
        for (int i = 0; i < len; i++, j--){
            if(input[i] == input[j]){
                if(j == 0){
                return true;
                }
                continue;
            }
            break;
        }
        return false;
    }

}
