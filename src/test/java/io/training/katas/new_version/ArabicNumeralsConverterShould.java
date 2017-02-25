package io.training.katas.new_version;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ArabicNumeralsConverterShould {

    @Test
    public void should_return_1_given_I() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("I")).isEqualTo(1);
    }

    @Test
    public void should_return_2_given_II() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("II")).isEqualTo(2);
    }

    @Test
    public void should_return_3_given_III() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("III")).isEqualTo(3);
    }

    @Test
    public void should_return_10_given_X() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("X")).isEqualTo(10);
    }


    @Test
    public void should_return_20_given_XX() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("XX")).isEqualTo(20);
    }

    @Test
    public void should_return_30_given_XX() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("XXX")).isEqualTo(30);
    }

    @Test
    public void should_return_23_given_XXIII() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("XXIII")).isEqualTo(23);
    }

    @Test
    public void should_return_5_given_V() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("V")).isEqualTo(5);
    }

    @Test
    public void should_return_50_given_L() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("L")).isEqualTo(50);
    }

    @Test
    public void should_return_100_given_C() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("C")).isEqualTo(100);
    }

    @Test
    public void should_return_500_given_D() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("D")).isEqualTo(500);
    }

    @Test
    public void should_return_1000_given_M() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("M")).isEqualTo(1000);
    }


    @Test
    public void should_return_3000_given_MMM() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("MMM")).isEqualTo(3000);
    }

    @Test
    public void should_return_3578_given_MMMDLXXVIII() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("MMMDLXXVIII")).isEqualTo(3578);
    }

    @Test
    public void should_return_4_given_IV() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("IV")).isEqualTo(4);
    }

    @Test
    public void should_return_9_given_IX() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("IX")).isEqualTo(9);
    }

    @Test
    public void should_return_40_given_XL() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("XL")).isEqualTo(40);
    }

    @Test
    public void should_return_90_given_XC() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("XC")).isEqualTo(90);
    }

    @Test
    public void should_return_400_given_CD() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("CD")).isEqualTo(400);
    }

    @Test
    public void should_return_900_given_CM() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("CM")).isEqualTo(900);
    }

    @Test
    public void should_return_3498_given_MMMCDXCVIII() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("MMMCDXCVIII")).isEqualTo(3498);
    }

}
