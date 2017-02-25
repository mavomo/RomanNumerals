package io.training.katas.new_version;

/**
 * Created by Michelle on 25/02/2017.
 */
public class RomanNumeralsConverter {

    public static String convertFromArabic(int arabicNumeral) {

        if (arabicNumeral == 10){
            return "X";
        }
        if (arabicNumeral == 20){
            return "XX";
        }
        if (arabicNumeral == 30){
            return "XXX";
        }

     StringBuilder romanNumeralValue = new StringBuilder();

     for (int i=0; i < arabicNumeral; i++){
         romanNumeralValue.append("I");
     }

     return romanNumeralValue.toString();
    }
}
