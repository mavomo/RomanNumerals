package io.training.katas.new_version;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Created by Michelle on 25/02/2017.
 */
public class ArabicNumeralsConverter {

    public static int convertFromRoman(String romanNumeral) {
        int arabicNumber = 0;
        Map<String, Integer> arabicNumeralsChart = new TreeMap<>();
        arabicNumeralsChart.put("M", 1000);
        arabicNumeralsChart.put("D", 500);
        arabicNumeralsChart.put("C", 100);
        arabicNumeralsChart.put("L", 50);
        arabicNumeralsChart.put("X", 10);
        arabicNumeralsChart.put("V", 5);
        arabicNumeralsChart.put("I", 1);

        Map<String, Integer> result = new LinkedHashMap<>();


        arabicNumeralsChart.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));


        for (String romanNumeralKey : result.keySet()){
            int arabicNumeralValue = arabicNumeralsChart.get(romanNumeralKey);
            while (romanNumeral.startsWith(romanNumeralKey)){
                    arabicNumber+= arabicNumeralValue;
                    romanNumeral = romanNumeral.substring(1);
                }
            }
        return arabicNumber;
    }
}
