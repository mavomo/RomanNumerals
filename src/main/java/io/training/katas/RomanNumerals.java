package io.training.katas;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Michelle on 08/02/2017.
 */
public class RomanNumerals {


    public static String convertToArabic(int number) {

        StringBuilder value = new StringBuilder();
        Map<Integer, String> romanNumerals = new TreeMap<>(Collections.reverseOrder());
        romanNumerals.put(100, "C");
        romanNumerals.put(50, "L");
        romanNumerals.put(10, "X");
        romanNumerals.put(5, "V");
        romanNumerals.put(1, "I");

        for(Integer key : romanNumerals.keySet()){
            int numberToDecrement = key;
            while (number >= key){
                String romanNumeral = romanNumerals.get(key);
                value.append(romanNumeral);
                number -= numberToDecrement;
            }
        }


      /*  if (number == numberToDecrement){
            value.append("C");
            number -=numberToDecrement;
        }*/

      /*  numberToDecrement = 50;
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
    }*/

        return  value.toString();
    }
}
