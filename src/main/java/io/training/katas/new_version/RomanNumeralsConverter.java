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

        StringBuilder romanNumeralValue = new StringBuilder();

        for(Integer arabicValue : getRomanNumeralChart().keySet()){

            int numberToDecrement = arabicValue;

            while (numberToDecrement <= arabicNumeral){

                romanNumeralValue.append(getRomanNumeralChart().get(numberToDecrement));
                arabicNumeral -= numberToDecrement;
            }
        }
     return romanNumeralValue.toString();
    }


    private static Map<Integer, String> getRomanNumeralChart() {
        Map<Integer, String> romanNumeralsChart = new TreeMap<>(Collections.<Integer>reverseOrder());

        romanNumeralsChart.put(1000, "M");
        romanNumeralsChart.put(900, "CM");
        romanNumeralsChart.put(500, "D");
        romanNumeralsChart.put(400, "CD");
        romanNumeralsChart.put(100, "C");
        romanNumeralsChart.put(90, "XC");
        romanNumeralsChart.put(50, "L");
        romanNumeralsChart.put(40, "XL");
        romanNumeralsChart.put(10, "X");
        romanNumeralsChart.put(9, "IX");
        romanNumeralsChart.put(4, "IV");
        romanNumeralsChart.put(5, "V");
        romanNumeralsChart.put(1, "I");
        return romanNumeralsChart;
    }
}
