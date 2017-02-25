package io.training.katas.new_version;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Michelle on 25/02/2017.
 */
public class RomanNumeralsConverter {

    public static String convertFromArabic(int arabicNumeral) {

        Map<Integer, String> romanNumeralsChart = new TreeMap<>(Collections.<Integer>reverseOrder());
        romanNumeralsChart.put(10, "X");
        romanNumeralsChart.put(1, "I");

        StringBuilder romanNumeralValue = new StringBuilder();
        for(Integer arabicValue : romanNumeralsChart.keySet()){
            int numberToDecrement = arabicValue;
            for (;numberToDecrement <= arabicNumeral;){
                romanNumeralValue.append(romanNumeralsChart.get(numberToDecrement));
                arabicNumeral -= numberToDecrement;
            }
        }
/*
     numberToDecrement = 1;
     for (; numberToDecrement <= arabicNumeral;) {
         romanNumeralValue.append("I");
         arabicNumeral -= numberToDecrement;
     }*/

     return romanNumeralValue.toString();
    }
}
