package io.training.katas;

/**
 * Created by Michelle on 08/02/2017.
 */
public class RomanNumerals {


    public static String convertToArabic(int number) {
        StringBuilder value = new StringBuilder();

        if (number ==100){
            value.append("C");
            number -=100;
        }
        if (number == 50){
            value.append("L");
            number -= 50;
        }

        if (number > 50){
            value.append("L");
            number -= 50;
        }

        while (number > 10){
            value.append("X");
            number -=10;
        }

        if (number == 10){
            value.append("X");
        }

        if (number > 5 && number<10) {
            value.append("V");
            number -= 5;
        }

/*        if (number == 20){
            value.append("X");
        }*/
        if (number == 5){
            value.append("V");
        }

    if(number < 5) {
        for (int i = 1; i <= number; i++) {
            value.append("I");
        }
    }
        /*if (number == 2){
            return "II";
        }
        if(number == 3){
            return "III";
        }
        return "I";*/
        return  value.toString();
    }
}
