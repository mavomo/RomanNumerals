package io.training.katas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Michelle on 21/01/2017.
 */
public class RomanNumeralsTest {

    @Test
    public void should_return_I_given_number_1(){
        assertThat(RomanNumeral.converFromArabic(1)).isEqualTo("I");
    }

    @Test
    public void should_return_V_given_number_5(){
        assertThat(RomanNumeral.converFromArabic(5)).isEqualTo("V");
    }

    @Test
    public void should_return_X_given_number_10(){
        assertThat(RomanNumeral.converFromArabic(10)).isEqualTo("X");
    }

    @Test
    public void should_return_L_given_number_50(){
        assertThat(RomanNumeral.converFromArabic(50)).isEqualTo("L");
    }

    @Test
    public void should_return_C_given_number_100(){
        assertThat(RomanNumeral.converFromArabic(100)).isEqualTo("C");
    }

    @Test
    public void should_return_D_given_number_500(){
        assertThat(RomanNumeral.converFromArabic(500)).isEqualTo("D");
    }

    @Test
    public void should_return_M_given_number_1000(){
        assertThat(RomanNumeral.converFromArabic(1000)).isEqualTo("M");
    }

    @Test
    public void should_return_II_given_number_2(){
        assertThat(RomanNumeral.converFromArabic(2)).isEqualTo("II");
    }


    @Test
    public void should_return_III_given_number_3(){
        assertThat(RomanNumeral.converFromArabic(3)).isEqualTo("III");
    }



}
