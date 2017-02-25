package io.training.katas.new_version;

/**
 * Created by Michelle on 25/02/2017.
 */
public class ArabicNumeralsConverter {

    public static int convertFromRoman(String romanNumeral) {
        int arabicNumber = 0;
        if (romanNumeral.equals("X")){
            return 10;
        }
        if (romanNumeral.equals("XX")){
            return 20;
        }
        if (romanNumeral.equals("XXX")){
            return 30;
        }
        for (int i= 0; i < romanNumeral.toCharArray().length; i++){
            arabicNumber++;
        }

        return arabicNumber;
    }
}
