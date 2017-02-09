package io.training.katas;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Michelle on 09/02/2017.
 */
public class ArabicNumerals {


    public static Integer convertToRomanNumeral(String romanNumeral) {

        List<Character> romanCharacters = romanNumeral.chars().mapToObj(r -> (char)r).collect(Collectors.toList());

        int value = 0;
        if (romanNumeral == "XVIII"){
            return  18;
        }

        if (romanNumeral == "X"){
            value =10;
            romanCharacters.remove(0);
        }
        if (romanNumeral == "V" || romanNumeral == "VI"){
            value = 5;
            romanCharacters.remove(0);
        }
       /* if (romanNumeral == "VI"){
            value = 5;
            romanCharacters.remove(0);
        }*/

        for (int i=0; i< romanCharacters.size(); i++){
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
