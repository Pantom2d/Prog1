package Prog1.Aufgabe5;

public class GGT {
    public static void main(String[] args) {
        int result = calculateGGT(700, 350);
        System.out.println(result);
    }

    public static int calculateGGT(int x, int y){

        if(x == y)
            return x;

        if(x > y)
            return calculateGGT(x-y, y);

        if(x < y)
            return calculateGGT(x, y-x);

        return 0;

    }
    
}
