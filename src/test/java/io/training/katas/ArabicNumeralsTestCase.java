package io.training.katas;


import org.junit.Test;

import static io.training.katas.ArabicNumerals.convertToArabicNumerals;
import static org.assertj.core.api.Assertions.assertThat;

public class ArabicNumeralsTestCase {


    @Test
    public void should_return_1_given_I() {
        assertThat(convertToArabicNumerals("I")).isEqualTo(1);
    }

    @Test
    public void should_return_2_given_II() {
        assertThat(convertToArabicNumerals("II")).isEqualTo(2);
    }

    @Test
    public void should_return_3_given_III() {
        assertThat(convertToArabicNumerals("III")).isEqualTo(3);
    }

    @Test
    public void should_return_5_given_V() {
        assertThat(convertToArabicNumerals("V")).isEqualTo(5);
    }
    @Test
    public void should_return_6_given_VI() {
        assertThat(convertToArabicNumerals("VI")).isEqualTo(6);
    }

    @Test
    public void should_return_10_given_X() {
        assertThat(convertToArabicNumerals("X")).isEqualTo(10);
    }


    @Test
    public void should_return_18_given_XVIII() {
        assertThat(convertToArabicNumerals("XVIII")).isEqualTo(18);
    }

    @Test
    public void should_return_38_given_XXXVIII() {
        assertThat(convertToArabicNumerals("XXXVIII")).isEqualTo(38);
    }


    @Test
    public void should_return_50_given_L() {
        assertThat(convertToArabicNumerals("L")).isEqualTo(50);
    }

    @Test
    public void should_return_100_given_C() {
        assertThat(convertToArabicNumerals("C")).isEqualTo(100);
    }

    @Test
    public void should_return_500_given_D() {
        assertThat(convertToArabicNumerals("D")).isEqualTo(500);
    }

    @Test
    public void should_return_1000_given_M() {
        assertThat(convertToArabicNumerals("M")).isEqualTo(1000);
    }

    @Test
    public void should_return_1578_given_M() {
        assertThat(convertToArabicNumerals("MDLXXVIII")).isEqualTo(1578);
    }

    @Test
    public void should_return_3578_given_M() {
        assertThat(convertToArabicNumerals("MMMDLXXVIII")).isEqualTo(3578);
    }

    @Test
    public void should_return_4_given_IV() {
        assertThat(convertToArabicNumerals("IV")).isEqualTo(4);
    }

    @Test
    public void should_return_9_given_IX() {
        assertThat(convertToArabicNumerals("IX")).isEqualTo(9);
    }


    @Test
    public void should_return_40_given_XL() {
        assertThat(convertToArabicNumerals("XL")).isEqualTo(40);
    }


    @Test
    public void should_return_90_given_XC() {
        assertThat(convertToArabicNumerals("XC")).isEqualTo(90);
    }

    @Test
    public void should_return_MMMCDXCIX_given_3499(){
        assertThat(RomanNumerals.convertToArabic(3499)).isEqualTo("MMMCDXCIX");
    }





}
