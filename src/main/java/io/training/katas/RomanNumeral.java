package io.training.katas;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Michelle on 21/01/2017.
 */
public class RomanNumeral {

    public static String converFromArabic(int number) {
        Map<Integer, String> romanNumerals = buildRomanNumeralCharts();
        String value = null;
        StringBuilder romanNumeralToReturn = new StringBuilder();

        int arabicNumberToConvert = 10;
        while (number >= arabicNumberToConvert && number<40){
            value = romanNumerals.get(arabicNumberToConvert);
            romanNumeralToReturn.append(value);
            number -= arabicNumberToConvert;
        }
        arabicNumberToConvert = 5;
        while (number >= arabicNumberToConvert && number <=8){
            value = romanNumerals.get(arabicNumberToConvert);
            romanNumeralToReturn.append(value);
            number -= arabicNumberToConvert;
        }

        arabicNumberToConvert = 1;
        if (number <= 4 ){
            while (number>=arabicNumberToConvert){
                value = romanNumerals.get(arabicNumberToConvert);
                romanNumeralToReturn.append(value);
                number -= arabicNumberToConvert;
            }
            return  romanNumeralToReturn.toString();
        }

        return  romanNumerals.get(number);
    }

    private static Map<Integer, String> buildRomanNumeralCharts() {
        Map<Integer, String> romanNumeralsCharts = new HashMap<>();
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
