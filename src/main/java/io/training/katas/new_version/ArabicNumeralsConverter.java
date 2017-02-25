package io.training.katas.new_version;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Michelle on 25/02/2017.
 */
public class ArabicNumeralsConverter {

    public static int convertFromRoman(String romanNumeral) {
        Map<String, Integer> sortedArabicNumeralsChart = sortArabicNumeralsInReverseOrderUsingValue();

        int arabicNumber = 0;
        for (String romanNumeralKey : sortedArabicNumeralsChart.keySet()){
            int arabicNumeralValue = sortedArabicNumeralsChart.get(romanNumeralKey);

            while (romanNumeral.startsWith(romanNumeralKey)){
                    arabicNumber+= arabicNumeralValue;
                    romanNumeral = romanNumeral.substring(romanNumeralKey.length());
                }
            }
        return arabicNumber;
    }

    private static Map<String, Integer> sortArabicNumeralsInReverseOrderUsingValue() {
        Map<String, Integer> result = new LinkedHashMap<>();
        buildArabicNumeralsChart().entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
        return result;
    }

    private static Map<String, Integer> buildArabicNumeralsChart() {
        Map<String, Integer> arabicNumeralsChart = new TreeMap<>();

        arabicNumeralsChart.put("M", 1000);
        arabicNumeralsChart.put("CM", 900);
        arabicNumeralsChart.put("D", 500);
        arabicNumeralsChart.put("CD", 400);
        arabicNumeralsChart.put("C", 100);
        arabicNumeralsChart.put("XC", 90);
        arabicNumeralsChart.put("L", 50);
        arabicNumeralsChart.put("XL",40);
        arabicNumeralsChart.put("X", 10);
        arabicNumeralsChart.put("IX",9);
        arabicNumeralsChart.put("V", 5);
        arabicNumeralsChart.put("IV",4);
        arabicNumeralsChart.put("I", 1);
        return arabicNumeralsChart;
    }
}
