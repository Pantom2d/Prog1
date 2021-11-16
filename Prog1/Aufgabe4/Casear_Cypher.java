package Prog1.Aufgabe4;

import java.util.Arrays;

public class Casear_Cypher {

    public static int SHIFT = 13;
    public static void main(String[] args) {
        String s = "Uheen qre Pbqr shaxgvbavreg";
        char[] plainText = toCharacterArray(s);
        System.out.println("Plaintext: ");
        printArray(plainText);

       /*  System.out.println("Encoded Array: ");
        char[] encodedText = encodeArray(plainText);
        printArray(encodedText); */

        System.out.println("Decoded Array: ");
        char[] decodedText = decodeArray(plainText);
        printArray(decodedText);
        
    }
    public static char[] toCharacterArray( String s ) {

        if ( s == null ) {
        return null;
        }

        int len = s.length();
        char[] array = new char[len];
        for (int i = 0; i < len ; i++) {
            array[i] = s.charAt(i);
        }

        return array;
    }
    public static void printArray(char[] input) {
        System.out.println(Arrays.toString(input));
    }
    public static char encodeCharacter(char c, int shift){
        int cI = (int)c;

        if (cI >= 65 && cI <= 90 - shift){
            cI = cI + shift;
            return c = (char)cI;
        }
        if (cI >= 90 - shift && cI <= 90){
            cI = cI + shift - 26;
            return c = (char)cI;
        }
        if (cI >= 97 && cI <= 122 - shift){
            cI = cI + shift;
            return c = (char)cI;
        }
        if (cI >= 97 - shift && cI <= 122){
            cI = cI + shift - 26;
            return c = (char)cI;
        } else{
            cI = 32;
            return c = (char)cI;
        }
    }
    public static char[] encodeArray (char[] input){
        char[] output = new char[input.length];
        for(int i = 0; i < input.length; i++){
            char c = input[i];
            output[i] = encodeCharacter(c, SHIFT);
        }
        return output;
    }

    public static char decodeCharacter(char c, int shift){
        int cI = (int)c;

        if (cI <= 90 && cI >= 65 + shift){
            cI = cI - shift;
            return c = (char)cI;
        }
        if (cI <= 65 + shift && cI >= 65){
            cI = cI - shift + 26;
            return c = (char)cI;
        }
        if (cI <= 122 && cI >= 97 + shift){
            cI = cI - shift;
            return c = (char)cI;
        }
        if (cI <= 97 + shift && cI >= 97){
            cI = cI - shift + 26;
            return c = (char)cI;
        } else{
            cI = 32;
            return c = (char)cI;
        }
    }

    public static char[] decodeArray (char[] input){
        char[] output = new char[input.length];
        for(int i = 0; i < input.length; i++){
            char c = input[i];
            output[i] = decodeCharacter(c, SHIFT);
        }
        return output;
    }
   
}
