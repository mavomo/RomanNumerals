package io.training.katas.new_version;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Michelle on 25/02/2017.
 */
public class ArabicNumeralsConverter {

    public static int convertFromRoman(String romanNumeral) {
        int arabicNumber = 0;
        Map<String, Integer> arabicNumeralsChart = new TreeMap<>(Collections.reverseOrder());
        arabicNumeralsChart.put("X", 10);
        arabicNumeralsChart.put("I", 1);

        for (String romanNumeralKey : arabicNumeralsChart.keySet()){
            int arabicNumeralValue = arabicNumeralsChart.get(romanNumeralKey);
            while (romanNumeral.startsWith(romanNumeralKey)){
                    arabicNumber+= arabicNumeralValue;
                    romanNumeral = romanNumeral.substring(1);
                }
            /*    if(romanNumeral.startsWith("I")){
                    arabicNumber+=1;
                    romanNumeral = romanNumeral.substring(1);
                }*/
            }
        return arabicNumber;
    }
}
