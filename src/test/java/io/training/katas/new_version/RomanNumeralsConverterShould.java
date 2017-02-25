package io.training.katas.new_version;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by Michelle on 25/02/2017.
 */
public class RomanNumeralsConverterShould {

    @Test
    public void should_return_I_given_1() {
        Assertions.assertThat(RomanNumeralsConverter.convertFromArabic(1)).isEqualTo("I");
    }

    @Test
    public void should_return_II_given_2() {
        Assertions.assertThat(RomanNumeralsConverter.convertFromArabic(2)).isEqualTo("II");
    }


    @Test
    public void should_return_III_given_3() {
        Assertions.assertThat(RomanNumeralsConverter.convertFromArabic(3)).isEqualTo("III");
    }

    @Test
    public void should_return_X_given_10() {
        Assertions.assertThat(RomanNumeralsConverter.convertFromArabic(10)).isEqualTo("X");
    }


    @Test
    public void should_return_XX_given_20() {
        Assertions.assertThat(RomanNumeralsConverter.convertFromArabic(20)).isEqualTo("XX");
    }


    @Test
    public void should_return_XXX_given_30() {
        Assertions.assertThat(RomanNumeralsConverter.convertFromArabic(30)).isEqualTo("XXX");
    }

    @Test
    public void should_return_XXXIII_given_33() {
        Assertions.assertThat(RomanNumeralsConverter.convertFromArabic(33)).isEqualTo("XXXIII");
    }

    @Test
    public void should_return_V_given_5() {
        Assertions.assertThat(RomanNumeralsConverter.convertFromArabic(5)).isEqualTo("V");
    }

    @Test
    public void should_return_XXXVIII_given_38() {
        Assertions.assertThat(RomanNumeralsConverter.convertFromArabic(38)).isEqualTo("XXXVIII");
    }


    @Test
    public void should_return_L_given_50() {
        Assertions.assertThat(RomanNumeralsConverter.convertFromArabic(50)).isEqualTo("L");
    }


    @Test
    public void should_return_C_given_100() {
        Assertions.assertThat(RomanNumeralsConverter.convertFromArabic(100)).isEqualTo("C");
    }


    @Test
    public void should_return_D_given_500() {
        Assertions.assertThat(RomanNumeralsConverter.convertFromArabic(500)).isEqualTo("D");
    }


    @Test
    public void should_return_M_given_1000() {
        Assertions.assertThat(RomanNumeralsConverter.convertFromArabic(1000)).isEqualTo("M");
    }

    @Test
    public void should_return_MMMDCCLXXVIII_given_3778() {
        Assertions.assertThat(RomanNumeralsConverter.convertFromArabic(3778)).isEqualTo("MMMDCCLXXVIII");
    }







}
