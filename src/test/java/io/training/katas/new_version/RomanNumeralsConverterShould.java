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




}
