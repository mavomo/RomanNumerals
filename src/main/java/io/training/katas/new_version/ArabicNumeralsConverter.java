package io.training.katas.new_version;

/**
 * Created by Michelle on 25/02/2017.
 */
public class ArabicNumeralsConverter {

    public static int convertFromRoman(String romanNumeral) {
        if (romanNumeral.equals("I")){
            return 1;
        }
        if (romanNumeral.equals("II")){
            return 2;
        }

        if (romanNumeral.equals("III")){
            return 3;
        }

        return 0;
    }
}
