package io.training.katas.old;


import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArabicNumeralsOldTestCase {


    @Test
    public void should_return_1_given_I() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("I")).isEqualTo(1);
    }

    @Test
    public void should_return_2_given_II() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("II")).isEqualTo(2);
    }

    @Test
    public void should_return_3_given_III() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("III")).isEqualTo(3);
    }

    @Test
    public void should_return_5_given_V() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("V")).isEqualTo(5);
    }
    @Test
    public void should_return_6_given_VI() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("VI")).isEqualTo(6);
    }

    @Test
    public void should_return_10_given_X() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("X")).isEqualTo(10);
    }


    @Test
    public void should_return_18_given_XVIII() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("XVIII")).isEqualTo(18);
    }

    @Test
    public void should_return_38_given_XXXVIII() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("XXXVIII")).isEqualTo(38);
    }


    @Test
    public void should_return_50_given_L() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("L")).isEqualTo(50);
    }

    @Test
    public void should_return_100_given_C() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("C")).isEqualTo(100);
    }

    @Test
    public void should_return_500_given_D() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("D")).isEqualTo(500);
    }

    @Test
    public void should_return_1000_given_M() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("M")).isEqualTo(1000);
    }

    @Test
    public void should_return_1578_given_MDLXXVIII() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("MDLXXVIII")).isEqualTo(1578);
    }

    @Test
    public void should_return_3578_given_MMMDLXXVIII() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("MMMDLXXVIII")).isEqualTo(3578);
    }

    @Test
    public void should_return_4_given_IV() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("IV")).isEqualTo(4);
    }

    @Test
    public void should_return_9_given_IX() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("IX")).isEqualTo(9);
    }


    @Test
    public void should_return_40_given_XL() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("XL")).isEqualTo(40);
    }


    @Test
    public void should_return_90_given_XC() {
        Assertions.assertThat(ArabicNumeralsOld.convertToArabicNumerals("XC")).isEqualTo(90);
    }

    @Test
    public void should_return_MMMCDXCIX_given_3499(){
        assertThat(RomanNumerals.convertToArabic(3499)).isEqualTo("MMMCDXCIX");
    }





}
