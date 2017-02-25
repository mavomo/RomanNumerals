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
}
