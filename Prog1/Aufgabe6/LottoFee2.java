package Prog1.Aufgabe6;

import java.util.Random;

public class LottoFee2 {

    private int[] LOTTOZAHLEN = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,
                        31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49};
    private int[] SUPERZAHL = {0,1,2,3,4,5,6,7,8,9};
    private int COUNTER = 1;
    public LottoFee2(){
        for(int i = 0; i < 7; i++){
            System.out.println("Zahl " + i + " :" + nextNumber());
        }
    }

    public byte nextNumber() {
        Random rand = new Random();
        int number;
        byte returnNumber;
        while (COUNTER > 0 && COUNTER < 7){
            int randomNumber = rand.nextInt(49);
            number = LOTTOZAHLEN[randomNumber];
            if (number == -1){
                continue;
            } else {
                returnNumber = (byte)number;
                LOTTOZAHLEN[randomNumber] = -1;
                COUNTER++;
                return returnNumber;
            }
        }
        if (COUNTER == 7){
            int randomNumber = rand.nextInt(10);
            number = SUPERZAHL[randomNumber];
            returnNumber = (byte)number;
            return returnNumber;
        }
        return -1;
    }

    public static void main(String[] args) {
        LottoFee2 ziehung1 = new LottoFee2();
        LottoFee2 ziehung2 = new LottoFee2();
    }
    
}
