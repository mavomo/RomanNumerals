package io.training.katas;


import org.assertj.core.api.Assertions;
import org.junit.Test;

import static io.training.katas.ArabicNumerals.convertToRomanNumeral;
import static org.assertj.core.api.Assertions.assertThat;

public class ArabicNumeralsTestCase {


    @Test
    public void should_return_1_given_I() {
        assertThat(convertToRomanNumeral("I")).isEqualTo(1);
    }

    @Test
    public void should_return_2_given_II() {
        assertThat(convertToRomanNumeral("II")).isEqualTo(2);
    }

    @Test
    public void should_return_3_given_III() {
        assertThat(convertToRomanNumeral("III")).isEqualTo(3);
    }

    @Test
    public void should_return_5_given_V() {
        assertThat(convertToRomanNumeral("V")).isEqualTo(5);
    }
    @Test
    public void should_return_6_given_VI() {
        assertThat(convertToRomanNumeral("VI")).isEqualTo(6);
    }

    @Test
    public void should_return_10_given_X() {
        assertThat(convertToRomanNumeral("X")).isEqualTo(10);
    }


    @Test
    public void should_return_18_given_XVIII() {
        assertThat(convertToRomanNumeral("XVIII")).isEqualTo(18);
    }

    @Test
    public void should_return_38_given_XXXVIII() {
        assertThat(convertToRomanNumeral("XXXVIII")).isEqualTo(38);
    }


    @Test
    public void should_return_50_given_L() {
        assertThat(convertToRomanNumeral("L")).isEqualTo(50);
    }

    @Test
    public void should_return_100_given_C() {
        assertThat(convertToRomanNumeral("C")).isEqualTo(100);
    }

    @Test
    public void should_return_500_given_D() {
        assertThat(convertToRomanNumeral("D")).isEqualTo(500);
    }

    @Test
    public void should_return_1000_given_M() {
        assertThat(convertToRomanNumeral("M")).isEqualTo(1000);
    }

    @Test
    public void should_return_1578_given_M() {
        assertThat(convertToRomanNumeral("MDLXXVIII")).isEqualTo(1578);
    }

    @Test
    public void should_return_3578_given_M() {
        assertThat(convertToRomanNumeral("MMMDLXXVIII")).isEqualTo(3578);
    }

    @Test
    public void should_return_4_given_IV() {
        assertThat(convertToRomanNumeral("IV")).isEqualTo(4);
    }






}
