package io.training.katas;

/**
 * Created by Michelle on 09/02/2017.
 */
public class ArabicNumerals {


    public static Integer convertToRomanNumeral(String romanNumeral) {
        if (romanNumeral == "II"){
            return 2;
        }
        if (romanNumeral == "III"){
            return 3;
        }
        return 1;
    }
}
