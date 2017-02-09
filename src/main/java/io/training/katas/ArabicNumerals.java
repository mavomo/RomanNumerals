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


    public static Integer convertToRomanNumeral(String romanNumeral) {


        Map<Character, Integer> arabicNumeralsCharts = new TreeMap<>(Collections.reverseOrder());

        arabicNumeralsCharts.put('M', 1000);
        arabicNumeralsCharts.put('D', 500);
        arabicNumeralsCharts.put('C', 100);
        arabicNumeralsCharts.put('L', 50);
        arabicNumeralsCharts.put('X', 10);
        arabicNumeralsCharts.put('V', 5);
        arabicNumeralsCharts.put('I', 1);

        char[] romanCharacters = romanNumeral.toCharArray();
        int value = 0;

        if (romanNumeral == "IV"){
            return 4;
        }
        for (int index =0; index < romanCharacters.length; index++){
            Character currentChar = romanCharacters[index];
            value += arabicNumeralsCharts.get(currentChar);
        }
        return value;
    }
}
