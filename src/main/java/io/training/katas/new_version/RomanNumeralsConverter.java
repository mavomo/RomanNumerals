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
     for (; 1 <= arabicNumeral;) {
         romanNumeralValue.append("I");
         arabicNumeral -= 1;
     }

     return romanNumeralValue.toString();
    }
}
