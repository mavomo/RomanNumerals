package io.training.katas.new_version;

import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Michelle on 25/02/2017.
 */
public class ArabicNumeralsConverter {

    public static int convertFromRoman(String romanNumeral) {
        int arabicNumber = 0;
        Character[] romanNumeralsAsChars = romanNumeral.chars().mapToObj(c -> (char)c).toArray(Character[]::new);

        List<Character> romanNumerals = new ArrayList<>(Arrays.asList(romanNumeralsAsChars));

         for (int i=0; i < romanNumerals.size();){
             if (romanNumeral.startsWith("X")){
                 arabicNumber += 10;
                 romanNumerals.remove(i);
             }
    }

/*
        if (romanNumeral.equals("X")){
            return 10;
        }
        if (romanNumeral.equals("XX")){
            return 20;
        }
        if (romanNumeral.equals("XXX")){
            return 30;
        }
*/
        if (!romanNumerals.isEmpty()) {
            for (int i = 0; i < romanNumerals.size(); i++) {
                arabicNumber++;
            }
        }

        return arabicNumber;
    }
}
