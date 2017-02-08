package io.training.katas;

/**
 * Created by Michelle on 08/02/2017.
 */
public class RomanNumerals {


    public static String convertToArabic(int number) {

        StringBuilder value = new StringBuilder();

        int numberToDecrement = 100;

        while (number >= 100){
            value.append("C");
            number -=numberToDecrement;
        }

      /*  if (number == numberToDecrement){
            value.append("C");
            number -=numberToDecrement;
        }*/

        numberToDecrement = 50;
        if (number == numberToDecrement){
            value.append("L");
            number -= numberToDecrement;
        }

        if (number > numberToDecrement){
            value.append("L");
            number -= numberToDecrement;
        }

        numberToDecrement = 10;
        while (number > numberToDecrement){
            value.append("X");
            number -=numberToDecrement;
        }

        if (number == numberToDecrement){
            value.append("X");
        }

        numberToDecrement = 5;
        if (number > numberToDecrement && number<10) {
            value.append("V");
            number -= numberToDecrement;
        }

        if (number == numberToDecrement){
            value.append("V");
        }

    if(number < numberToDecrement) {
        for (int i = 1; i <= number; i++) {
            value.append("I");
        }
    }

        return  value.toString();
    }
}
