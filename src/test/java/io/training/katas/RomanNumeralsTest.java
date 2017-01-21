package io.training.katas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by Michelle on 21/01/2017.
 */
public class RomanNumeralsTest {

    @Test
    public void should_return_I_given_1(){
        String arabicLetter = RomanNumeral.converFromArabic("1");
        Assertions.assertThat(arabicLetter).isEqualTo("I");

    }


}
