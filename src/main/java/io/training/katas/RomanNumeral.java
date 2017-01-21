package io.training.katas;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Michelle on 21/01/2017.
 */
public class RomanNumeral {

    public static String converFromArabic(int number) {
        Map<Integer, String> romanNumerals = buildRomanNumeralCharts();
        if (number <= 4 ){
            String value = romanNumerals.get(1);
            StringBuilder romanNumeralToReturn = new StringBuilder();
            for (int i=1; i<=number; i++){
                romanNumeralToReturn.append(value);
            }
            return  romanNumeralToReturn.toString();
        }
        /*if (number == 2) {
            return "II";
        }
        if (number == 3) {
            return "III";
        }*/
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
