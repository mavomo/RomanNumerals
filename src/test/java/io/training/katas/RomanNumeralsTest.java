package io.training.katas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Michelle on 21/01/2017.
 */
public class RomanNumeralsTest {

    @Test
    public void should_return_I_given_1(){
        assertThat(RomanNumeral.converFromArabic(1)).isEqualTo("I");
    }

    @Test
    public void should_return_V_given_5(){
        assertThat(RomanNumeral.converFromArabic(5)).isEqualTo("V");
    }

}
