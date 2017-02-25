package io.training.katas.new_version;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by Michelle on 25/02/2017.
 */
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
    public void should_return_L_given_50() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("L")).isEqualTo(50);
    }

    @Test
    public void should_return_C_given_100() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("C")).isEqualTo(100);
    }

    @Test
    public void should_return_D_given_500() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("D")).isEqualTo(500);
    }

    @Test
    public void should_return_M_given_1000() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("M")).isEqualTo(1000);
    }


    @Test
    public void should_return_MMM_given_3000() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("MMM")).isEqualTo(3000);
    }

    @Test
    public void should_return_MMMDLXXVIII_given_3578() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("MMMDLXXVIII")).isEqualTo(3578);
    }


    @Test
    public void should_return_IV_given_4() {
        Assertions.assertThat(ArabicNumeralsConverter.convertFromRoman("IV")).isEqualTo(4);
    }


}
