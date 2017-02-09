package io.training.katas;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Created by Michelle on 09/02/2017.
 */
public class ArabicNumerals {


    public static Integer convertToArabicNumerals(String romanNumeral) {

        Map<Character, Integer> arabicNumeralsCharts = getArabicNumeralsChart();

        char[] romanCharacters = romanNumeral.toCharArray();

        int value = 0;
        for (int index =0; index < romanCharacters.length; index++){
            Character currentChar = romanCharacters[index];
            int arabicValueOfCurrentChar = arabicNumeralsCharts.get(currentChar);
            value += arabicValueOfCurrentChar;
            for (int nextIndex = index+1; nextIndex < romanCharacters.length; nextIndex++){
                if (romanCharacters.length > nextIndex){
                    Character nextChar = romanCharacters[nextIndex];
                    int arabicValueOfNextChar = arabicNumeralsCharts.get(nextChar);
                    if (arabicValueOfCurrentChar < arabicValueOfNextChar){
                        value -= arabicValueOfCurrentChar;
                        value += arabicValueOfNextChar - arabicValueOfCurrentChar;
                        index++;
                    }
                }
            }
        }
        return value;
    }

    private static Map<Character, Integer> getArabicNumeralsChart() {
        Map<Character, Integer> arabicNumeralsCharts = new TreeMap<>(Collections.reverseOrder());

        arabicNumeralsCharts.put('M', 1000);
        arabicNumeralsCharts.put('D', 500);
        arabicNumeralsCharts.put('C', 100);
        arabicNumeralsCharts.put('L', 50);
        arabicNumeralsCharts.put('X', 10);
        arabicNumeralsCharts.put('V', 5);
        arabicNumeralsCharts.put('I', 1);
        return arabicNumeralsCharts;
    }
}
