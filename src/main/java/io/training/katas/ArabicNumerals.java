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

        arabicNumeralsCharts.put('X', 10);
        arabicNumeralsCharts.put('V', 5);
        arabicNumeralsCharts.put('I', 1);

        List<Character> romanCharacters = romanNumeral.chars().mapToObj(r -> (char)r).collect(Collectors.toList());

        int value = 0;
        for (int index =0; index < romanCharacters.size(); index++){
            Character currentChar = romanCharacters.get(index);
            value += arabicNumeralsCharts.get(currentChar);
           // romanCharacters.remove(index);
        }

      /*  for (int i=0; i< romanCharacters.size(); i++){
            value ++;
        }*/
      /*  if (romanNumeral == "XVIII"){
            return  18;
        }*/
        return value;
    }
}
