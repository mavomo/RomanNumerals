package io.training.katas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Michelle on 08/02/2017.
 */
public class RomanNumeralTestCase {

    @Test
    public void should_return_I_given_1(){
        assertThat(RomanNumerals.convertToArabic(1)).isEqualTo("I");
    }


    @Test
    public void should_return_II_given_2(){
        assertThat(RomanNumerals.convertToArabic(2)).isEqualTo("II");
    }


    @Test
    public void should_return_III_given_3(){
        assertThat(RomanNumerals.convertToArabic(3)).isEqualTo("III");
    }

    @Test
    public void should_return_V_given_5(){
        assertThat(RomanNumerals.convertToArabic(5)).isEqualTo("V");
    }

    @Test
    public void should_return_VI_given_6(){
        assertThat(RomanNumerals.convertToArabic(6)).isEqualTo("VI");
    }

    @Test
    public void should_return_X_given_10(){
        assertThat(RomanNumerals.convertToArabic(10)).isEqualTo("X");
    }

    @Test
    public void should_return_XI_given_11(){
        assertThat(RomanNumerals.convertToArabic(11)).isEqualTo("XI");
    }


    @Test
    public void should_return_XX_given_20(){
        assertThat(RomanNumerals.convertToArabic(20)).isEqualTo("XX");
    }

    @Test
    public void should_return_XXX_given_30(){
        assertThat(RomanNumerals.convertToArabic(30)).isEqualTo("XXX");
    }


    @Test
    public void should_return_L_given_50(){
        assertThat(RomanNumerals.convertToArabic(50)).isEqualTo("L");
    }

    @Test
    public void should_return_LXXVII_given_77(){
        assertThat(RomanNumerals.convertToArabic(77)).isEqualTo("LXXVII");
    }

    @Test
    public void should_return_C_given_100(){
        assertThat(RomanNumerals.convertToArabic(100)).isEqualTo("C");
    }

    @Test
    public void should_return_CC_given_200(){
        assertThat(RomanNumerals.convertToArabic(200)).isEqualTo("CC");
    }
}
