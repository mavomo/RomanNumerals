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

        if (number > 10 && number<40){
            value = romanNumerals.get(10);
            romanNumeralToReturn.append(value);
            number -= 10;
        }

        if (number > 5 && number <=8){
            value = romanNumerals.get(5);
            romanNumeralToReturn.append(value);
            number -= 5;
        }

        if (number <= 4 ){
            value = romanNumerals.get(1);
            for (;0<number;){
                romanNumeralToReturn.append(value);
                number -= 1;
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
