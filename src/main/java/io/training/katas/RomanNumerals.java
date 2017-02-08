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
        romanNumerals.put(1000, "M");
        romanNumerals.put(500, "D");
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
        return  value.toString();
    }
}
