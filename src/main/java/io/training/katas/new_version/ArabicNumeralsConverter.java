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
        while (romanNumeral.length() > 0 ){
             if (romanNumeral.startsWith("X")){
                 arabicNumber+= 10;
                 romanNumeral = romanNumeral.substring(1);
             }
             if(romanNumeral.startsWith("I")){
                 arabicNumber+=1;
                 romanNumeral = romanNumeral.substring(1);
             }
        }

        return arabicNumber;
    }
}
