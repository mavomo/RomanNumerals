package io.training.katas.new_version;

/**
 * Created by Michelle on 25/02/2017.
 */
public class RomanNumeralsConverter {

    public static String convertFromArabic(int arabicNumeral) {

     StringBuilder romanNumeralValue = new StringBuilder();
     for (;10 <= arabicNumeral;){
            romanNumeralValue.append("X");
            arabicNumeral -= 10;
     }
     for (int i = 1; i <= arabicNumeral; i++) {
             romanNumeralValue.append("I");
     }

     return romanNumeralValue.toString();
    }
}
