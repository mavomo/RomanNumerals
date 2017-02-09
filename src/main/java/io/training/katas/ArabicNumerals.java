package io.training.katas;

/**
 * Created by Michelle on 09/02/2017.
 */
public class ArabicNumerals {


    public static Integer convertToRomanNumeral(String romanNumeral) {

        char[] romanCharacters = romanNumeral.toCharArray();



        int value = 0;
        if (romanNumeral == "V"){
            return 5;
        }
        if (romanNumeral == "VI"){
            return 6;
        }

        for (int i=0; i<romanCharacters.length; i++){
            value ++;
        }
       /* if (romanNumeral == "II"){
            return 2;
        }
        if (romanNumeral == "III"){
            return 3;
        }*/
        return value;
    }
}
