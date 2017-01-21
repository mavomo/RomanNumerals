package io.training.katas;

import java.util.*;

/**
 * Created by Michelle on 21/01/2017.
 */
public class RomanNumeral {

    public static String converFromArabic(int number) {

        Map<Integer, String> romanNumerals = buildRomanNumeralCharts();
        StringBuilder romanNumeralToReturn = new StringBuilder();
        for (Integer key : romanNumerals.keySet()){
            int arabicNumberToConvert = key;
            while (number >= arabicNumberToConvert){
              String value = romanNumerals.get(arabicNumberToConvert);
                romanNumeralToReturn.append(value);
                number -= arabicNumberToConvert;
            }
        }
        return romanNumeralToReturn.toString();
    }

    private static Map<Integer, String> buildRomanNumeralCharts() {
        Map<Integer, String> romanNumeralsCharts = new TreeMap<>(Collections.<Integer>reverseOrder());
        romanNumeralsCharts.put(1, "I");
        romanNumeralsCharts.put(5, "V");
        romanNumeralsCharts.put(4, "IV");
        romanNumeralsCharts.put(9, "IX");
        romanNumeralsCharts.put(10, "X");
        romanNumeralsCharts.put(40, "XL");
        romanNumeralsCharts.put(50, "L");
        romanNumeralsCharts.put(90, "XC");
        romanNumeralsCharts.put(100, "C");
        romanNumeralsCharts.put(400, "CD");
        romanNumeralsCharts.put(500, "D");
        romanNumeralsCharts.put(900, "CM");
        romanNumeralsCharts.put(1000, "M");

        return romanNumeralsCharts;
    }
}
