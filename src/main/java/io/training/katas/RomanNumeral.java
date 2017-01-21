package io.training.katas;

import java.util.*;

/**
 * Created by Michelle on 21/01/2017.
 */
public class RomanNumeral {

    public static String converFromArabic(int number) {
        Map<Integer, String> romanNumerals = buildRomanNumeralCharts();
        String value = romanNumerals.get(number);

        StringBuilder romanNumeralToReturn = new StringBuilder();

        for (Integer key : romanNumerals.keySet()){
            int arabicNumberToConvert = key;
            while (number >= arabicNumberToConvert){
                value = romanNumerals.get(arabicNumberToConvert);
                romanNumeralToReturn.append(value);
                number -= arabicNumberToConvert;
            }
        }
/*
        arabicNumberToConvert = 5;
        while (number >= arabicNumberToConvert && number <=8){
            value = romanNumerals.get(arabicNumberToConvert);
            romanNumeralToReturn.append(value);
            number -= arabicNumberToConvert;
        }

        arabicNumberToConvert = 1;
        while (number>=arabicNumberToConvert && number<50){
                value = romanNumerals.get(arabicNumberToConvert);
                romanNumeralToReturn.append(value);
                number -= arabicNumberToConvert;
        }

        if (number>=50){
            romanNumeralToReturn.append(value);
        }*/
        return romanNumeralToReturn.toString();
    }

    private static Map<Integer, String> buildRomanNumeralCharts() {
        Map<Integer, String> romanNumeralsCharts = new TreeMap<>(Collections.<Integer>reverseOrder());
        romanNumeralsCharts.put(1, "I");
        romanNumeralsCharts.put(5, "V");
        romanNumeralsCharts.put(10, "X");
        romanNumeralsCharts.put(50, "L");
        romanNumeralsCharts.put(100, "C");
        romanNumeralsCharts.put(500, "D");
        romanNumeralsCharts.put(1000, "M");

        return romanNumeralsCharts;
    }
}
