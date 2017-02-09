package io.training.katas;


import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArabicNumeralsTestCase {


    @Test
    public void should_return_1_given_I() {
        assertThat(ArabicNumerals.convertToRomanNumeral("I")).isEqualTo(1);
    }

    @Test
    public void should_return_2_given_II() {
        assertThat(ArabicNumerals.convertToRomanNumeral("II")).isEqualTo(2);
    }

    @Test
    public void should_return_3_given_III() {
        assertThat(ArabicNumerals.convertToRomanNumeral("III")).isEqualTo(3);
    }


    @Test
    public void should_return_5_given_V() {
        assertThat(ArabicNumerals.convertToRomanNumeral("V")).isEqualTo(5);
    }
    @Test
    public void should_return_6_given_VI() {
        assertThat(ArabicNumerals.convertToRomanNumeral("VI")).isEqualTo(6);
    }

    @Test
    public void should_return_10_given_X() {
        assertThat(ArabicNumerals.convertToRomanNumeral("X")).isEqualTo(10);
    }


    @Test
    public void should_return_18_given_XVIII() {
        assertThat(ArabicNumerals.convertToRomanNumeral("XVIII")).isEqualTo(18);
    }






}
